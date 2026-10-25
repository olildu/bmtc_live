package app.chalo.validation;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigFactory;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import defpackage.u71;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/ProductValidationConfigFactoryImpl;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationConfigFactory;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductValidationConfigFactoryImpl implements ProductValidationConfigFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u71 f10455a;
    public final u71 b;
    public final u71 c;
    public final u71 d;
    public final u71 e;
    public final u71 f;
    public final u71 g;
    public final u71 h;

    public ProductValidationConfigFactoryImpl(u71 u71Var, u71 u71Var2, u71 u71Var3, u71 u71Var4, u71 u71Var5, u71 u71Var6, u71 u71Var7, u71 u71Var8) {
        this.f10455a = u71Var;
        this.b = u71Var2;
        this.c = u71Var3;
        this.d = u71Var4;
        this.e = u71Var5;
        this.f = u71Var6;
        this.g = u71Var7;
        this.h = u71Var8;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationConfigFactory
    public final ProductValidationConfig a(ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "validationProduct");
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            return (ProductValidationConfig) this.f10455a.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) {
            return (ProductValidationConfig) this.b.invoke();
        }
        if ((validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation)) {
            return (ProductValidationConfig) this.c.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            return (ProductValidationConfig) this.d.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) {
            return (ProductValidationConfig) this.e.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) {
            return (ProductValidationConfig) this.f.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) {
            return (ProductValidationConfig) this.g.invoke();
        }
        if (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            return (ProductValidationConfig) this.h.invoke();
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation) {
            throw new IllegalStateException("MultiModalGroupTicketValidation cannot be created via factory (would be circular)");
        }
        throw new NoWhenBranchMatchedException();
    }
}
