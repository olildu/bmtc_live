package app.chalo.wallet.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.wallet.ui.base.WalletDestination;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import app.chalo.walletframework.wallet.domain.model.PromotionCardRemoteConfigItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/wallet/domain/GetBannerForWalletScreenUseCase;", "", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetBannerForWalletScreenUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10771a;
    public final ChaloConfigFeature b;
    public final CrashlyticsLogger c;
    public final GetWalletStatusWithoutSyncUseCase d;
    public final GetWalletAndAllTransactionsWithoutSyncUseCase e;
    public final ChaloBuildConfig f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lapp/chalo/wallet/domain/GetBannerForWalletScreenUseCase$Companion;", "", "", "DEFAULT", "Ljava/lang/String;", "", "SHOW_TO_ALL", "I", "SHOW_TO_VALID", "SHOW_TO_NOT_VALID", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetBannerForWalletScreenUseCase(CityProvider cityProvider, ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, GetWalletAndAllTransactionsWithoutSyncUseCase getWalletAndAllTransactionsWithoutSyncUseCase, ChaloBuildConfig chaloBuildConfig) {
        this.f10771a = cityProvider;
        this.b = chaloConfigFeature;
        this.c = crashlyticsLogger;
        this.d = getWalletStatusWithoutSyncUseCase;
        this.e = getWalletAndAllTransactionsWithoutSyncUseCase;
        this.f = chaloBuildConfig;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x0063 A[ADDED_TO_REGION, SYNTHETIC] */
    public static void a(WalletDestination walletDestination, boolean z, boolean z2, boolean z3, List list, List list2) {
        boolean z4;
        boolean z5;
        try {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                PromotionCardRemoteConfigItem promotionCardRemoteConfigItem = (PromotionCardRemoteConfigItem) it.next();
                WalletDestination.Companion companion = WalletDestination.INSTANCE;
                String str = promotionCardRemoteConfigItem.e;
                companion.getClass();
                WalletDestination walletDestinationA = WalletDestination.Companion.a(str);
                int i = promotionCardRemoteConfigItem.b;
                int i2 = promotionCardRemoteConfigItem.c;
                int i3 = promotionCardRemoteConfigItem.d;
                if (walletDestinationA == walletDestination) {
                    boolean z6 = false;
                    if ((i == 1 && z) || i == 0) {
                        if (i2 == 1 || !z2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!z4 || i2 == 0) {
                            if (i3 == 1 || !z3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (!z5 || i3 == 0) {
                                list.add(new PromotionCardItem(promotionCardRemoteConfigItem.f11087a, promotionCardRemoteConfigItem.f));
                            } else {
                                if (i3 == 2 && !z3) {
                                    z6 = true;
                                }
                                if (z6) {
                                    list.add(new PromotionCardItem(promotionCardRemoteConfigItem.f11087a, promotionCardRemoteConfigItem.f));
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            if (i2 == 2 && !z2) {
                                if (i3 == 1) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                }
                                list.add(new PromotionCardItem(promotionCardRemoteConfigItem.f11087a, promotionCardRemoteConfigItem.f));
                            } else {
                                continue;
                            }
                        }
                    } else {
                        if (i == 2 && !z) {
                            if (i2 == 1) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                            }
                            if (i3 == 1) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                            }
                            list.add(new PromotionCardItem(promotionCardRemoteConfigItem.f11087a, promotionCardRemoteConfigItem.f));
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:70:0x018d, B:72:0x0194, B:76:0x01a8, B:78:0x01ac, B:79:0x01ba, B:81:0x01c0, B:88:0x01d5, B:89:0x01dd, B:91:0x01e3, B:95:0x01f6, B:100:0x01ff, B:101:0x0205, B:102:0x020d, B:104:0x0213, B:107:0x0225, B:112:0x022e, B:23:0x0066, B:66:0x0176), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0213 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:70:0x018d, B:72:0x0194, B:76:0x01a8, B:78:0x01ac, B:79:0x01ba, B:81:0x01c0, B:88:0x01d5, B:89:0x01dd, B:91:0x01e3, B:95:0x01f6, B:100:0x01ff, B:101:0x0205, B:102:0x020d, B:104:0x0213, B:107:0x0225, B:112:0x022e, B:23:0x0066, B:66:0x0176), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x022b  */
    /* JADX WARN: Code duplicated, block: B:111:0x022d  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:2: B:102:0x020d->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x013f A[Catch: Exception -> 0x0048, TryCatch #2 {Exception -> 0x0048, blocks: (B:16:0x0042, B:28:0x0084, B:58:0x0139, B:60:0x013f, B:62:0x0153, B:61:0x0146, B:51:0x011c, B:54:0x0122), top: B:119:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146 A[Catch: Exception -> 0x0048, TryCatch #2 {Exception -> 0x0048, blocks: (B:16:0x0042, B:28:0x0084, B:58:0x0139, B:60:0x013f, B:62:0x0153, B:61:0x0146, B:51:0x011c, B:54:0x0122), top: B:119:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ac A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:70:0x018d, B:72:0x0194, B:76:0x01a8, B:78:0x01ac, B:79:0x01ba, B:81:0x01c0, B:88:0x01d5, B:89:0x01dd, B:91:0x01e3, B:95:0x01f6, B:100:0x01ff, B:101:0x0205, B:102:0x020d, B:104:0x0213, B:107:0x0225, B:112:0x022e, B:23:0x0066, B:66:0x0176), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:70:0x018d, B:72:0x0194, B:76:0x01a8, B:78:0x01ac, B:79:0x01ba, B:81:0x01c0, B:88:0x01d5, B:89:0x01dd, B:91:0x01e3, B:95:0x01f6, B:100:0x01ff, B:101:0x0205, B:102:0x020d, B:104:0x0213, B:107:0x0225, B:112:0x022e, B:23:0x0066, B:66:0x0176), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:70:0x018d, B:72:0x0194, B:76:0x01a8, B:78:0x01ac, B:79:0x01ba, B:81:0x01c0, B:88:0x01d5, B:89:0x01dd, B:91:0x01e3, B:95:0x01f6, B:100:0x01ff, B:101:0x0205, B:102:0x020d, B:104:0x0213, B:107:0x0225, B:112:0x022e, B:23:0x0066, B:66:0x0176), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r14 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r14 == r1) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v11, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.wallet.ui.base.WalletDestination r12, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.domain.GetBannerForWalletScreenUseCase.b(app.chalo.wallet.ui.base.WalletDestination, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
