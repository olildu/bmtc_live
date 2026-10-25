package app.chalo.checkout.domain.checkoutitem;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/checkoutitem/GetChaloPayCheckoutItemUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloPayCheckoutItemUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f1390a;
    public final CurrencyFeature b;
    public final WalletRepository c;
    public final UserProfileDetailsProvider d;

    public GetChaloPayCheckoutItemUseCase(StringProvider stringProvider, CurrencyFeature currencyFeature, WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f1390a = stringProvider;
        this.b = currencyFeature;
        this.c = walletRepository;
        this.d = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014b, code lost:
    
        if (r2 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e1, code lost:
    
        if (r2 == r3) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver r27, app.chalo.walletframework.chalopay.ChaloPayManager r28, app.chalo.checkout.data.model.app.CheckoutPaymentMethod r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase.a(app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver, app.chalo.walletframework.chalopay.ChaloPayManager, app.chalo.checkout.data.model.app.CheckoutPaymentMethod, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
