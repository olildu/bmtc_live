package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModelKt;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1", f = "ChaloBusRouteInfoComponent.kt", l = {438}, m = "invokeSuspend", v = 1)
final class ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ RouteSuggestionSearchSource $source;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusRouteInfoComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3311a;

        static {
            int[] iArr = new int[RouteSuggestionSearchSource.values().length];
            try {
                iArr[RouteSuggestionSearchSource.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteSuggestionSearchSource.DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3311a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, String str, RouteSuggestionSearchSource routeSuggestionSearchSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusRouteInfoComponent;
        this.$requestId = str;
        this.$source = routeSuggestionSearchSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1 chaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1 = new ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1(this.this$0, this.$requestId, this.$source, continuation);
        chaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1.L$0 = obj;
        return chaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ChaloBusRouteInfoViewIntent routeSuggestionPickupSelectedIntent;
        ChaloBusRouteInfoViewIntent routeSuggestionPickupSelectedIntent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = this.this$0;
            Flow flowB = chaloBusRouteInfoComponent.n.b(this.$requestId);
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objV = chaloBusRouteInfoComponent.b.v(flowB, this);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objV;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        CoroutineScopeKt.d(coroutineScope);
        if (!(resultStateData instanceof ResultStateData.Cancelled)) {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
            String str = universalSearchResultState.f9060a;
            String str2 = universalSearchResultState.b;
            Object objB = null;
            if (str != null && str.length() != 0) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, StopAppModel.INSTANCE.serializer());
                } catch (Exception unused) {
                }
                StopAppModel stopAppModel = (StopAppModel) objB;
                if (stopAppModel != null) {
                    ChaloBusRouteInfoComponent chaloBusRouteInfoComponent2 = this.this$0;
                    int i2 = WhenMappings.f3311a[this.$source.ordinal()];
                    if (i2 == 1) {
                        routeSuggestionPickupSelectedIntent2 = new ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent(PBStopPlaceSelectedAppModelKt.a(stopAppModel));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        routeSuggestionPickupSelectedIntent2 = new ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent(PBStopPlaceSelectedAppModelKt.a(stopAppModel));
                    }
                    chaloBusRouteInfoComponent2.N0(routeSuggestionPickupSelectedIntent2);
                }
            } else if (str2 != null && str2.length() != 0) {
                try {
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    objB = json2.b(str2, RecentPlaceAppModel.INSTANCE.serializer());
                } catch (Exception unused2) {
                }
                RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
                if (recentPlaceAppModel != null) {
                    ChaloBusRouteInfoComponent chaloBusRouteInfoComponent3 = this.this$0;
                    int i3 = WhenMappings.f3311a[this.$source.ordinal()];
                    if (i3 == 1) {
                        routeSuggestionPickupSelectedIntent = new ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent(PBStopPlaceSelectedAppModelKt.b(recentPlaceAppModel));
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        routeSuggestionPickupSelectedIntent = new ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent(PBStopPlaceSelectedAppModelKt.b(recentPlaceAppModel));
                    }
                    chaloBusRouteInfoComponent3.N0(routeSuggestionPickupSelectedIntent);
                }
            }
        }
        return Unit.f17538a;
    }
}
