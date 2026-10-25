package app.chalo.validation;

import app.chalo.mTicketing.validation.MTicketProductValidationConfig;
import app.chalo.metro.validation.MetroTicketProductValidationConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig;
import app.chalo.ondc.validation.OndcTicketProductValidationConfig;
import app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationConfig;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig;
import app.chalo.validation.instantticket.InstantTicketProductValidationConfig;
import app.chalo.validation.superpass.SuperPassProductValidationConfig;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/ProductValidationConfigProviderImpl;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationConfigProvider;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductValidationConfigProviderImpl implements ProductValidationConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayTicketProductValidationConfig f10456a;
    public final SuperPassProductValidationConfig b;
    public final InstantTicketProductValidationConfig c;
    public final MTicketProductValidationConfig d;
    public final PremiumReserveTicketValidationConfig e;
    public final OndcTicketProductValidationConfig f;
    public final OndcMetroTicketProductValidationConfig g;
    public final MetroTicketProductValidationConfig h;
    public final MultiModalGroupTicketValidationConfig i;

    public ProductValidationConfigProviderImpl(QuickPayTicketProductValidationConfig quickPayTicketProductValidationConfig, SuperPassProductValidationConfig superPassProductValidationConfig, InstantTicketProductValidationConfig instantTicketProductValidationConfig, MTicketProductValidationConfig mTicketProductValidationConfig, PremiumReserveTicketValidationConfig premiumReserveTicketValidationConfig, OndcTicketProductValidationConfig ondcTicketProductValidationConfig, OndcMetroTicketProductValidationConfig ondcMetroTicketProductValidationConfig, MetroTicketProductValidationConfig metroTicketProductValidationConfig, MultiModalGroupTicketValidationConfig multiModalGroupTicketValidationConfig) {
        this.f10456a = quickPayTicketProductValidationConfig;
        this.b = superPassProductValidationConfig;
        this.c = instantTicketProductValidationConfig;
        this.d = mTicketProductValidationConfig;
        this.e = premiumReserveTicketValidationConfig;
        this.f = ondcTicketProductValidationConfig;
        this.g = ondcMetroTicketProductValidationConfig;
        this.h = metroTicketProductValidationConfig;
        this.i = multiModalGroupTicketValidationConfig;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider
    public final ProductValidationConfig a(ValidationProduct type) {
        Intrinsics.i(type, "type");
        if (type instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            return this.d;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            return this.c;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) {
            return this.e;
        }
        if ((type instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) || (type instanceof ValidationProduct.SuperPassProduct.MagicPassValidation)) {
            return this.b;
        }
        if (type instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            return this.f10456a;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) {
            return this.f;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) {
            return this.g;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) {
            return this.h;
        }
        if (type instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation) {
            return this.i;
        }
        throw new NoWhenBranchMatchedException();
    }
}
