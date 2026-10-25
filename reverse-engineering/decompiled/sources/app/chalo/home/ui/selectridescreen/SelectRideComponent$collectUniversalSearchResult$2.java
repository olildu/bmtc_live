package app.chalo.home.ui.selectridescreen;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.selectridescreen.SelectRideComponent$collectUniversalSearchResult$2", f = "SelectRideComponent.kt", l = {356}, m = "invokeSuspend", v = 1)
final class SelectRideComponent$collectUniversalSearchResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocationSelectionType $locationSelectionType;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectRideComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRideComponent$collectUniversalSearchResult$2(SelectRideComponent selectRideComponent, String str, LocationSelectionType locationSelectionType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = selectRideComponent;
        this.$requestId = str;
        this.$locationSelectionType = locationSelectionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectRideComponent$collectUniversalSearchResult$2 selectRideComponent$collectUniversalSearchResult$2 = new SelectRideComponent$collectUniversalSearchResult$2(this.this$0, this.$requestId, this.$locationSelectionType, continuation);
        selectRideComponent$collectUniversalSearchResult$2.L$0 = obj;
        return selectRideComponent$collectUniversalSearchResult$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectRideComponent$collectUniversalSearchResult$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objV;
        CoroutineScope coroutineScope;
        Object objB;
        Job job;
        Object objB2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            SelectRideComponent selectRideComponent = this.this$0;
            Flow flowB = selectRideComponent.m.b(this.$requestId);
            this.L$0 = coroutineScope2;
            this.label = 1;
            objV = selectRideComponent.b.v(flowB, this);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            objV = obj;
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        CoroutineScopeKt.d(coroutineScope);
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str = universalSearchResultState.b;
        String str2 = universalSearchResultState.f9060a;
        if (str != null && str.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB2;
            if (recentPlaceAppModel != null) {
                SelectRideComponent selectRideComponent2 = this.this$0;
                LocationSelectionType locationSelectionType = this.$locationSelectionType;
                String str3 = recentPlaceAppModel.e;
                String str4 = recentPlaceAppModel.h;
                String str5 = recentPlaceAppModel.g;
                LatLng latLng = recentPlaceAppModel.j;
                selectRideComponent2.G0(new SelectRideIntent.PlaceSelectionFieldResultIntent(locationSelectionType, new UserCommutePreferencePlaceLocationAppModel.Place(str3, str4, str5, latLng.f5134a, latLng.b, recentPlaceAppModel.f, UserCommutePreferenceStopPlaceResultType.PLACE)));
            }
        } else if (str2 != null && str2.length() != 0) {
            String strH = this.this$0.s.h();
            if (strH == null) {
                strH = "";
            }
            String str6 = strH;
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            StopAppModel stopAppModel = (StopAppModel) objB;
            if (stopAppModel != null) {
                SelectRideComponent selectRideComponent3 = this.this$0;
                LocationSelectionType locationSelectionType2 = this.$locationSelectionType;
                String str7 = stopAppModel.f1727a;
                String str8 = stopAppModel.b;
                String str9 = stopAppModel.e;
                LatLng latLng2 = stopAppModel.c;
                selectRideComponent3.G0(new SelectRideIntent.PlaceSelectionFieldResultIntent(locationSelectionType2, new UserCommutePreferencePlaceLocationAppModel.Stop(str7, str6, str8, str9, latLng2.f5134a, latLng2.b, "searchPartnerChaloStop", UserCommutePreferenceStopPlaceResultType.STOP)));
            }
        }
        Job job2 = this.this$0.t;
        if (job2 != null) {
            job = null;
            ((JobSupport) job2).cancel(null);
        } else {
            job = null;
        }
        this.this$0.t = job;
        return unit;
    }
}
