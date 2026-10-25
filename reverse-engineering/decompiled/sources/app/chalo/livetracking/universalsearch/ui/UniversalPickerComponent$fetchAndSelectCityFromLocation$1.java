package app.chalo.livetracking.universalsearch.ui;

import app.chalo.constants.Source;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.FetchCityMetaDataErrorType;
import app.chalo.data.CityIdAndDisplayNameAppModel;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.sm1;
import defpackage.vm1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$fetchAndSelectCityFromLocation$1", f = "UniversalPickerComponent.kt", l = {1576, 1585}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$fetchAndSelectCityFromLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatLng $latLng;
    final /* synthetic */ String $locationDescription;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$fetchAndSelectCityFromLocation$1(UniversalPickerComponent universalPickerComponent, LatLng latLng, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$latLng = latLng;
        this.$locationDescription = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$fetchAndSelectCityFromLocation$1(this.this$0, this.$latLng, this.$locationDescription, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$fetchAndSelectCityFromLocation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new vm1(2));
            CityMetaDataManager cityMetaDataManager = this.this$0.x;
            LatLng latLng = this.$latLng;
            this.label = 1;
            obj = cityMetaDataManager.a(latLng, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$1;
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
        }
        hq0.s(kotlinToastManager, (String) obj);
        UniversalSearchAnalyticsEventHelper.DefaultImpls.a(this.this$0.q, "universal search city fetch from location failed", Source.UNIVERSAL_SEARCH, vo1.s("reason", ((FetchCityMetaDataErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).toString()), 24);
        this.this$0.E0(new vm1(3));
        return Unit.f17538a;
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        String message = "fetchCityFromLocation res " + chaloUseCaseResult;
        Intrinsics.i(message, "message");
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            FetchCityMetaDataErrorType fetchCityMetaDataErrorType = (FetchCityMetaDataErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            if ((fetchCityMetaDataErrorType instanceof FetchCityMetaDataErrorType.CityIdNotAvailable) || (fetchCityMetaDataErrorType instanceof FetchCityMetaDataErrorType.CityMetaDataFetchError)) {
                UniversalPickerComponent universalPickerComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = universalPickerComponent.E;
                this.L$0 = chaloUseCaseResult;
                this.L$1 = kotlinToastManager2;
                this.label = 2;
                obj = universalPickerComponent.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    hq0.s(kotlinToastManager, (String) obj);
                }
                return coroutineSingletons;
            }
            if (!Intrinsics.d(fetchCityMetaDataErrorType, FetchCityMetaDataErrorType.CityNotServiceable.f1945a)) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalPickerComponent universalPickerComponent2 = this.this$0;
            String str = universalPickerComponent2.k.h;
            if (str != null) {
                UniversalSearchCitySelectionResult.CityNotServiceable cityNotServiceable = new UniversalSearchCitySelectionResult.CityNotServiceable(this.$latLng);
                UniversalSearchResultStateManager universalSearchResultStateManager = universalPickerComponent2.B;
                Json json = ChaloJson.b;
                json.getClass();
                universalSearchResultStateManager.c(new UniversalSearchResultState(null, null, null, json.a(UniversalSearchCitySelectionResult.INSTANCE.serializer(), cityNotServiceable), 7), str);
            }
            UniversalPickerComponent universalPickerComponent3 = this.this$0;
            universalPickerComponent3.q0(new sm1(universalPickerComponent3, 3));
            UniversalSearchAnalyticsEventHelper.DefaultImpls.a(this.this$0.q, "universal search city fetch from location failed", Source.UNIVERSAL_SEARCH, vo1.s("reason", ((FetchCityMetaDataErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).toString()), 24);
            this.this$0.E0(new vm1(3));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new vm1(4));
            UniversalPickerComponent universalPickerComponent4 = this.this$0;
            String str2 = universalPickerComponent4.k.h;
            if (str2 != null) {
                String str3 = this.$locationDescription;
                LatLng latLng2 = this.$latLng;
                UniversalSearchResultStateManager universalSearchResultStateManager2 = universalPickerComponent4.B;
                Json json2 = ChaloJson.b;
                CityIdAndDisplayNameAppModel cityIdAndDisplayNameAppModel = (CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                UniversalSearchCitySelectionResult.CitySelected citySelected = new UniversalSearchCitySelectionResult.CitySelected(str3, cityIdAndDisplayNameAppModel.f2340a, cityIdAndDisplayNameAppModel.b, latLng2);
                json2.getClass();
                universalSearchResultStateManager2.c(new UniversalSearchResultState(null, null, null, json2.a(UniversalSearchCitySelectionResult.INSTANCE.serializer(), citySelected), 7), str2);
            }
            UniversalPickerComponent universalPickerComponent5 = this.this$0;
            universalPickerComponent5.q0(new sm1(universalPickerComponent5, 4));
        }
        return Unit.f17538a;
    }
}
