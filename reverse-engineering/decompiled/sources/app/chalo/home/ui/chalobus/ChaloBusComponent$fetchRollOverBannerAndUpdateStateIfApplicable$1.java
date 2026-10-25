package app.chalo.home.ui.chalobus;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.data.model.app.response.BannerRequestType;
import app.chalo.home.data.model.app.response.BannerType;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.data.model.app.response.FetchBannerResponseAppModel;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.qd;
import defpackage.we;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1", f = "ChaloBusComponent.kt", l = {2042}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3239a;

        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.PASS_VALIDITY_EXPIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.PASS_RIDE_EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerType.PASS_EXPIRED_WITH_NO_REMAINING_RIDES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerType.PASS_EXPIRED_WITH_REMAINING_RIDES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_REMAINING_RIDES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_REMAINING_RIDES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BannerType.PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BannerType.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3239a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$fetchRollOverBannerAndUpdateStateIfApplicable$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchBannerUseCase fetchBannerUseCase = this.this$0.E;
            BannerRequestType bannerRequestType = BannerRequestType.HOME_SCREEN_RENEW_BANNER;
            this.label = 1;
            obj = fetchBannerUseCase.a(bannerRequestType, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new we(25));
            ChaloBusComponent chaloBusComponent = this.this$0;
            FetchBannerUseCase.FetchBannerErrorType fetchBannerErrorType = (FetchBannerUseCase.FetchBannerErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            chaloBusComponent.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = fetchBannerErrorType.f2991a;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errorType", str);
            Source source = Source.CHALO_BUS_SCREEN_TAB;
            linkedHashMap.put("source", source.getSourceName());
            linkedHashMap.put("bannerRequestType", BannerRequestType.HOME_SCREEN_RENEW_BANNER.getType());
            HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent.r, "banner fetch failed", linkedHashMap, source, 12);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((FetchBannerResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f2963a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                switch (WhenMappings.f3239a[((BannerDataResponseAppModel) obj2).f2951a.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        arrayList.add(obj2);
                        break;
                    case 9:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            ChaloBusComponent chaloBusComponent2 = this.this$0;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList.get(i2);
                i2++;
                arrayList2.add(((BannerDataResponseAppModel) obj3).f2951a);
            }
            chaloBusComponent2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("bannerCount", String.valueOf(size));
            Source source2 = Source.CHALO_BUS_SCREEN_TAB;
            linkedHashMap2.put("source", source2.getSourceName());
            linkedHashMap2.put("bannerRequestType", BannerRequestType.HOME_SCREEN_RENEW_BANNER.getType());
            linkedHashMap2.put("bannerTypes", CollectionsKt.O(arrayList2, ",", null, null, null, 62));
            HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent2.r, "banner fetch success", linkedHashMap2, source2, 12);
            if (!arrayList.isEmpty()) {
                ChaloBusComponent chaloBusComponent3 = this.this$0;
                BannerDataResponseAppModel bannerDataResponseAppModel = (BannerDataResponseAppModel) CollectionsKt.F(arrayList);
                chaloBusComponent3.getClass();
                BannerType bannerType = bannerDataResponseAppModel.f2951a;
                BannerMetaAppModel bannerMetaAppModel = bannerDataResponseAppModel.b;
                BannerUiDataAppModel bannerUiDataAppModel = bannerDataResponseAppModel.c;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("bannerType", bannerType.getType());
                linkedHashMap3.put("isExpired", String.valueOf(bannerMetaAppModel.c));
                linkedHashMap3.put("passExpiringInDays", String.valueOf(bannerMetaAppModel.b));
                linkedHashMap3.put("passId", String.valueOf(bannerMetaAppModel.d));
                linkedHashMap3.put("configId", String.valueOf(bannerMetaAppModel.e));
                SuperPassTripPreferences superPassTripPreferences = bannerMetaAppModel.f;
                linkedHashMap3.put("route id", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.f9575a : null));
                linkedHashMap3.put("from stop id", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.b : null));
                linkedHashMap3.put("from stop name", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.c : null));
                linkedHashMap3.put("to stop id", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.d : null));
                linkedHashMap3.put("to stop name", String.valueOf(superPassTripPreferences != null ? superPassTripPreferences.e : null));
                linkedHashMap3.put("passTierType", bannerMetaAppModel.g.getTierTypeStr());
                linkedHashMap3.put("bannerStatus", bannerUiDataAppModel.d.getStatus());
                linkedHashMap3.put("bannerMessage", String.valueOf(bannerUiDataAppModel.f2955a));
                HomeScreenAnalyticsHelper.DefaultImpls.a(chaloBusComponent3.r, "pb pass renewable banner shown", linkedHashMap3, source2, 12);
            }
            this.this$0.E0(new qd(1, arrayList));
        }
        return Unit.f17538a;
    }
}
