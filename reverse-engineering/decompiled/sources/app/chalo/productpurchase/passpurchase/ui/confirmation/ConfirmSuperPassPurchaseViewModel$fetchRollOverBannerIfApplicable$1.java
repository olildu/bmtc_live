package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.data.model.app.response.BannerRequestType;
import app.chalo.home.data.model.app.response.BannerType;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.data.model.app.response.FetchBannerResponseAppModel;
import app.chalo.home.domain.FetchBannerUseCase;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$fetchRollOverBannerIfApplicable$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {327}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$fetchRollOverBannerIfApplicable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $categoryId;
    final /* synthetic */ String $configId;
    final /* synthetic */ String $fmId;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$fetchRollOverBannerIfApplicable$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$configId = str;
        this.$fmId = str2;
        this.$categoryId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$fetchRollOverBannerIfApplicable$1(this.this$0, this.$configId, this.$fmId, this.$categoryId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$fetchRollOverBannerIfApplicable$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchBannerUseCase fetchBannerUseCase = this.this$0.F;
            BannerRequestType bannerRequestType = BannerRequestType.ROLL_OVER_CONFIRMATION_SCREEN_BANNER;
            Map mapI = MapsKt.i(new Pair("configId", this.$configId), new Pair("fmId", this.$fmId), new Pair("categoryId", this.$categoryId));
            this.label = 1;
            objA = fetchBannerUseCase.a(bannerRequestType, mapI, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objA = obj;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            MutableStateFlow mutableStateFlow = this.this$0.e;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value2, false, false, null, null, null, null, null, null, null, null, 1023)));
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
            FetchBannerUseCase.FetchBannerErrorType fetchBannerErrorType = (FetchBannerUseCase.FetchBannerErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            confirmSuperPassPurchaseViewModel.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = fetchBannerErrorType.f2991a;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errorType", str);
            Source source = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
            linkedHashMap.put("source", source.getSourceName());
            linkedHashMap.put("bannerRequestType", BannerRequestType.ROLL_OVER_CONFIRMATION_SCREEN_BANNER.getType());
            AnalyticsContractImplKt.b(confirmSuperPassPurchaseViewModel.n, "banner fetch failed", source, linkedHashMap, false, 24);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
            Object obj2 = ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            FetchBannerResponseAppModel fetchBannerResponseAppModel = (FetchBannerResponseAppModel) obj2;
            int size = fetchBannerResponseAppModel.f2963a.size();
            List list = fetchBannerResponseAppModel.f2963a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BannerDataResponseAppModel) it.next()).f2951a);
            }
            confirmSuperPassPurchaseViewModel2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("bannerCount", String.valueOf(size));
            Source source2 = Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT;
            linkedHashMap2.put("source", source2.getSourceName());
            linkedHashMap2.put("bannerRequestType", BannerRequestType.ROLL_OVER_CONFIRMATION_SCREEN_BANNER.getType());
            linkedHashMap2.put("bannerTypes", CollectionsKt.O(arrayList, ",", null, null, null, 62));
            AnalyticsContractImplKt.b(confirmSuperPassPurchaseViewModel2.n, "banner fetch success", source2, linkedHashMap2, false, 24);
            if (!fetchBannerResponseAppModel.f2963a.isEmpty()) {
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
                BannerDataResponseAppModel bannerDataResponseAppModel = (BannerDataResponseAppModel) fetchBannerResponseAppModel.f2963a.get(0);
                confirmSuperPassPurchaseViewModel3.getClass();
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
                AnalyticsContractImplKt.b(confirmSuperPassPurchaseViewModel3.n, "pb confirmation screen ride rollover banner shown", Source.CHALO_BUS_SCREEN_TAB, linkedHashMap3, false, 24);
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.e;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.c(value, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value, false, false, null, null, null, null, null, null, null, ((FetchBannerResponseAppModel) obj2).f2963a, 1023)));
        }
        return Unit.f17538a;
    }
}
