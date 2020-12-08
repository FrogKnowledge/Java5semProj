package by.belstu.stankevich.filters;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import by.belstu.stankevich.utilities.SimpleHash;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.thymeleaf.util.StringUtils.length;

@Component
@Order(0)
public class HashFilter implements Filter {



    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("attrs:");
        Enumeration<String> a= req.getAttributeNames();
        while(a.hasMoreElements()){
            String attr= a.nextElement();
            System.out.println(attr+":"+req.getAttribute(attr));
        }

        System.out.println("params:");
        Enumeration<String> b= req.getParameterNames();
        while(a.hasMoreElements()){
            String attr= a.nextElement();
            System.out.println(attr+":"+req.getParameter(attr));
        }

//        if(req.getParameter("password")!=null){
//            req.setParameter("password",SimpleHash.makeMd5HashInBase64Format((String) req.getAttribute("password")));
//        }

        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {}

    @Override
    public void init(FilterConfig arg0) throws ServletException {}

}