package app.chalo.onboarding.citylocationselection.ui;

import androidx.media3.extractor.text.ttml.TtmlNode;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.FetchCityMetaDataErrorType;
import app.chalo.data.CityIdAndDisplayNameAppModel;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.location.LatLng;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ap;
import defpackage.ko;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1", f = "CityLocationSelectionComponent.kt", l = {1038, 1075}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatLng $latLng;
    Object L$0;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1(CityLocationSelectionComponent cityLocationSelectionComponent, LatLng latLng, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$latLng = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1(this.this$0, this.$latLng, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        ChaloUseCaseResult chaloUseCaseResult2;
        CityLocationSelectionLayoutType cityLocationSelectionLayoutType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new ko(23));
            CityMetaDataManager cityMetaDataManager = this.this$0.m;
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
            chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.E0(new ko(24));
            CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            AnalyticsContractImplKt.a(cityLocationSelectionComponent.p, "city fetch from location failed", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) cityLocationSelectionComponent.f.getValue()).b.toSource(), vo1.s("reason", vo1.m("UnexpectedBengaluruResolution:", ((CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a).f2340a)), 48);
            return unit;
        }
        chaloUseCaseResult = chaloUseCaseResult2;
        CityLocationSelectionComponent cityLocationSelectionComponent2 = this.this$0;
        CityIdAndDisplayNameAppModel cityIdAndDisplayNameAppModel = (CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        cityLocationSelectionComponent2.I0(cityIdAndDisplayNameAppModel.f2340a, cityIdAndDisplayNameAppModel.b);
        return unit;
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            FetchCityMetaDataErrorType fetchCityMetaDataErrorType = (FetchCityMetaDataErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            if ((fetchCityMetaDataErrorType instanceof FetchCityMetaDataErrorType.CityIdNotAvailable) || (fetchCityMetaDataErrorType instanceof FetchCityMetaDataErrorType.CityMetaDataFetchError)) {
                cityLocationSelectionLayoutType = CityLocationSelectionLayoutType.FetchError;
            } else {
                if (!Intrinsics.d(fetchCityMetaDataErrorType, FetchCityMetaDataErrorType.CityNotServiceable.f1945a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.N0(this.$latLng, TtmlNode.TEXT_EMPHASIS_AUTO);
                cityLocationSelectionLayoutType = ((CityLocationSelectionState) this.this$0.f.getValue()).l ? CityLocationSelectionLayoutType.FetchError : CityLocationSelectionLayoutType.NoCityAvailable;
            }
            this.this$0.E0(new ap(cityLocationSelectionLayoutType, 1));
            CityLocationSelectionComponent cityLocationSelectionComponent3 = this.this$0;
            AnalyticsContractImplKt.a(cityLocationSelectionComponent3.p, "city fetch from location failed", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) cityLocationSelectionComponent3.f.getValue()).b.toSource(), vo1.s("reason", fetchCityMetaDataErrorType.toString()), 48);
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((CityLocationSelectionState) this.this$0.f.getValue()).l) {
            ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.E;
            String str = ((CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f2340a;
            this.L$0 = chaloUseCaseResult;
            this.label = 2;
            Object objC = chaloAppFeatureHelper.c(str, this);
            if (objC != coroutineSingletons) {
                chaloUseCaseResult2 = chaloUseCaseResult;
                obj = objC;
                if (!((Boolean) obj).booleanValue()) {
                    this.this$0.E0(new ko(24));
                    CityLocationSelectionComponent cityLocationSelectionComponent4 = this.this$0;
                    AnalyticsContractImplKt.a(cityLocationSelectionComponent4.p, "city fetch from location failed", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) cityLocationSelectionComponent4.f.getValue()).b.toSource(), vo1.s("reason", vo1.m("UnexpectedBengaluruResolution:", ((CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a).f2340a)), 48);
                    return unit;
                }
                chaloUseCaseResult = chaloUseCaseResult2;
            }
            return coroutineSingletons;
        }
        CityLocationSelectionComponent cityLocationSelectionComponent5 = this.this$0;
        CityIdAndDisplayNameAppModel cityIdAndDisplayNameAppModel2 = (CityIdAndDisplayNameAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        cityLocationSelectionComponent5.I0(cityIdAndDisplayNameAppModel2.f2340a, cityIdAndDisplayNameAppModel2.b);
        return unit;
    }
}
