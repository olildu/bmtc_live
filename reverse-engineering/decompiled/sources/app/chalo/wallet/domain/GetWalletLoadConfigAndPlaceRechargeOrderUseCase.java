package app.chalo.wallet.domain;

import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.GetValidWalletLoadConfigFromConfigListUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/GetWalletLoadConfigAndPlaceRechargeOrderUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletLoadConfigAndPlaceRechargeOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f10774a;
    public final GetWalletIdUseCase b;
    public final CityProvider c;
    public final GetValidWalletLoadConfigFromConfigListUseCase d;
    public final StringProvider e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10775a;

        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.SEMI_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10775a = iArr;
        }
    }

    public GetWalletLoadConfigAndPlaceRechargeOrderUseCase(WalletRepository walletRepository, GetWalletIdUseCase getWalletIdUseCase, CityProvider cityProvider, GetValidWalletLoadConfigFromConfigListUseCase getValidWalletLoadConfigFromConfigListUseCase, StringProvider stringProvider) {
        this.f10774a = walletRepository;
        this.b = getWalletIdUseCase;
        this.c = cityProvider;
        this.d = getValidWalletLoadConfigFromConfigListUseCase;
        this.e = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0172  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ae A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c2 A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TRY_ENTER, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d4 A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205 A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:141:0x020b A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0214  */
    /* JADX WARN: Code duplicated, block: B:144:0x0215  */
    /* JADX WARN: Code duplicated, block: B:147:0x0222 A[Catch: Exception -> 0x004f, WalletLoadBalanceRechargeOrderCreationException -> 0x0052, TryCatch #0 {Exception -> 0x004f, blocks: (B:20:0x004a, B:136:0x01ff, B:154:0x0246, B:27:0x0059, B:153:0x0244, B:117:0x01ae, B:121:0x01c2, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:131:0x01f5, B:139:0x0205, B:140:0x020a, B:141:0x020b, B:145:0x0216, B:147:0x0222, B:149:0x0226), top: B:187:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0225  */
    /* JADX WARN: Code duplicated, block: B:151:0x0242  */
    /* JADX WARN: Code duplicated, block: B:152:0x0243  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0290, code lost:
    
        if (r0 == r2) goto L165;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r19, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.domain.GetWalletLoadConfigAndPlaceRechargeOrderUseCase.a(int, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
