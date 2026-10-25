package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.validationsdk.blevalidation.config.ProductValidationCommonUIManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationUIManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationUIManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationCommonUIManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationUIManager implements ProductValidationUIManager, ProductValidationCommonUIManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductValidationCommonUIManager f7489a;

    public PremiumReserveTicketValidationUIManager(ProductValidationCommonUIManager productValidationCommonUIManager) {
        this.f7489a = productValidationCommonUIManager;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum a() {
        return StringEnum.VIEW_RECEIPT_BOTTOMSHEET_COPY_TICKET;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final /* bridge */ Object b(ProductValidationData productValidationData, Continuation continuation) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final /* bridge */ boolean c() {
        return true;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final /* bridge */ boolean d() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean e() {
        return true;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final /* bridge */ boolean f() {
        return true;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum g() {
        return StringEnum.PREMIUM_BUS_TICKET_EXPIRED_TITLE;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum h() {
        return StringEnum.PREMIUM_BUS_TRIP_EXPIRED_DIALOG_MESSAGE;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean i() {
        return true;
    }
}
