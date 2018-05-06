package ink.skylite.jsfblog.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;

@ManagedBean
@SessionScoped
public class LocaleChangeController implements Serializable {

    public void changeLocale(String localeName) {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(localeName));
    }
}
