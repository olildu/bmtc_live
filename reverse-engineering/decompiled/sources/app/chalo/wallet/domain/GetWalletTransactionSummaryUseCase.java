package app.chalo.wallet.domain;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/GetWalletTransactionSummaryUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletTransactionSummaryUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f10776a;
    public final QuickPayRepository b;
    public final StringProvider c;
    public final ProductValidationData d;
    public final CurrencyFeature e;
    public final TimeUtilsContract f;
    public final ResolveQuickPayProductNameUseCase g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10777a;

        static {
            int[] iArr = new int[WalletTransactionType.values().length];
            try {
                iArr[WalletTransactionType.QUICK_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletTransactionType.LOAD_MONEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletTransactionType.CHALO_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10777a = iArr;
        }
    }

    public GetWalletTransactionSummaryUseCase(WalletRepository walletRepository, QuickPayRepository quickPayRepository, StringProvider stringProvider, ProductValidationData productValidationData, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ResolveQuickPayProductNameUseCase resolveQuickPayProductNameUseCase) {
        this.f10776a = walletRepository;
        this.b = quickPayRepository;
        this.c = stringProvider;
        this.d = productValidationData;
        this.e = currencyFeature;
        this.f = timeUtilsContract;
        this.g = resolveQuickPayProductNameUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r14 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r14 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010d, code lost:
    
        if (r14 == r0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, app.chalo.walletframework.wallet.data.model.WalletTransactionType r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase.a(java.lang.String, java.lang.String, app.chalo.walletframework.wallet.data.model.WalletTransactionType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
