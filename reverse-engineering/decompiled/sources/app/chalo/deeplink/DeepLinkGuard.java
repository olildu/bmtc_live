package app.chalo.deeplink;

import app.chalo.chalocard.ChaloCardEntryDestination;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductInfoContract;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.IsNewCardExperienceEnabledUseCase;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuard;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkGuard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckIsUserLoggedInUseCase f2446a;
    public final CityProvider b;
    public final DeepLinkConsentManager c;
    public final DeepLinkAppOpenTracker d;
    public final DeepLinkPendingStore e;
    public final ProductInfoContract f;
    public final BasicInfoContract g;
    public final GetInstantTicketFeatureConfigUseCase h;
    public final GetPremiumBusCurrentCityConfigUseCase i;
    public final IsNewCardExperienceEnabledUseCase j;
    public final ProductBookingHelper k;
    public final MandatoryFirstHistoryCallGuard l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuard$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final void a(String message) {
            Intrinsics.i(message, "message");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2447a;

        static {
            int[] iArr = new int[MetroBookingFlowType.values().length];
            try {
                iArr[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2447a = iArr;
        }
    }

    public DeepLinkGuard(CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, CityProvider cityProvider, DeepLinkConsentManager deepLinkConsentManager, DeepLinkAppOpenTracker deepLinkAppOpenTracker, DeepLinkPendingStore deepLinkPendingStore, ProductInfoContract productInfoContract, BasicInfoContract basicInfoContract, GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, IsNewCardExperienceEnabledUseCase isNewCardExperienceEnabledUseCase, ProductBookingHelper productBookingHelper, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard) {
        this.f2446a = checkIsUserLoggedInUseCase;
        this.b = cityProvider;
        this.c = deepLinkConsentManager;
        this.d = deepLinkAppOpenTracker;
        this.e = deepLinkPendingStore;
        this.f = productInfoContract;
        this.g = basicInfoContract;
        this.h = getInstantTicketFeatureConfigUseCase;
        this.i = getPremiumBusCurrentCityConfigUseCase;
        this.j = isNewCardExperienceEnabledUseCase;
        this.k = productBookingHelper;
        this.l = mandatoryFirstHistoryCallGuard;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r2 r11 r12
      0x0042: PHI (r2v11 app.chalo.deeplink.DeepLinkResolutionResult) = (r2v8 app.chalo.deeplink.DeepLinkResolutionResult), (r2v17 app.chalo.deeplink.DeepLinkResolutionResult) binds: [B:40:0x0147, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r11v18 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r11v9 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r11v22 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:40:0x0147, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r12v27 java.lang.Object) = (r12v26 java.lang.Object), (r12v1 java.lang.Object) binds: [B:40:0x0147, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x012d  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:46:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r5.b(r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016e, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        if (r5.b(r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00ea, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.deeplink.DeepLinkResolutionResult r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.deeplink.DeepLinkGuard.a(app.chalo.deeplink.DeepLinkResolutionResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012d, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        if (r11 == r1) goto L55;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00fb, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.deeplink.DeepLinkResolutionResult r10, app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.deeplink.DeepLinkGuard.b(app.chalo.deeplink.DeepLinkResolutionResult, app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum c(CityAppModel cityAppModel, ContinuationImpl continuationImpl) {
        DeepLinkGuard$resolveCardRechargeStartDestination$1 deepLinkGuard$resolveCardRechargeStartDestination$1;
        if (continuationImpl instanceof DeepLinkGuard$resolveCardRechargeStartDestination$1) {
            deepLinkGuard$resolveCardRechargeStartDestination$1 = (DeepLinkGuard$resolveCardRechargeStartDestination$1) continuationImpl;
            int i = deepLinkGuard$resolveCardRechargeStartDestination$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deepLinkGuard$resolveCardRechargeStartDestination$1.label = i - Integer.MIN_VALUE;
            } else {
                deepLinkGuard$resolveCardRechargeStartDestination$1 = new DeepLinkGuard$resolveCardRechargeStartDestination$1(this, continuationImpl);
            }
        } else {
            deepLinkGuard$resolveCardRechargeStartDestination$1 = new DeepLinkGuard$resolveCardRechargeStartDestination$1(this, continuationImpl);
        }
        Object objB = deepLinkGuard$resolveCardRechargeStartDestination$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deepLinkGuard$resolveCardRechargeStartDestination$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            List list = cityAppModel.h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ModeMapInfoAppModel) obj).f8858a == ChaloTransitMode.BUS) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i3 = 0;
                loop1: while (true) {
                    if (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ArrayList arrayList2 = ((ModeMapInfoAppModel) obj2).c;
                        if (!arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj3 = arrayList2.get(i4);
                                i4++;
                                if (((AgencyInfoAppModel) obj3).g) {
                                    deepLinkGuard$resolveCardRechargeStartDestination$1.label = 1;
                                    objB = this.j.b(deepLinkGuard$resolveCardRechargeStartDestination$1);
                                    if (objB != coroutineSingletons) {
                                        break loop1;
                                    }
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                }
            }
            return ChaloCardEntryDestination.CARD_INFO_SCREEN;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        return ((Boolean) objB).booleanValue() ? ChaloCardEntryDestination.CARD_INFO_SCREEN : ChaloCardEntryDestination.CARD_RECHARGE_BY_ENTERING_CARD_NUMBER_SCREEN;
    }
}
