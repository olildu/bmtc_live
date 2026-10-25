package app.chalo.livetracking.search;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1", f = "StopBasedTripPlannerSearchComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forFromStop;
    final /* synthetic */ UniversalSearchOptions $searchOptions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1$1", f = "StopBasedTripPlannerSearchComponent.kt", l = {212}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = stopBasedTripPlannerSearchComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent = this.this$0;
                String str = stopBasedTripPlannerSearchComponent.u;
                this.label = 1;
                if (StopBasedTripPlannerSearchComponent.G0(stopBasedTripPlannerSearchComponent, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1$2", f = "StopBasedTripPlannerSearchComponent.kt", l = {221, 221}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $forFromStop;
        final /* synthetic */ UniversalSearchOptions $searchOptions;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, UniversalSearchOptions universalSearchOptions, Continuation continuation, boolean z) {
            super(2, continuation);
            this.$searchOptions = universalSearchOptions;
            this.this$0 = stopBasedTripPlannerSearchComponent;
            this.$forFromStop = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$searchOptions, continuation, this.$forFromStop);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strA;
            StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent;
            String sourceName;
            Object objB;
            String str;
            boolean z;
            ChaloNavigationManager chaloNavigationManager;
            Object objB2;
            String str2;
            String str3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloJson chaloJson = ChaloJson.f6455a;
                UniversalSearchOptions universalSearchOptions = this.$searchOptions;
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
                } catch (Exception unused) {
                    strA = null;
                }
                if (strA != null) {
                    stopBasedTripPlannerSearchComponent = this.this$0;
                    boolean z2 = this.$forFromStop;
                    ChaloNavigationManager chaloNavigationManager2 = stopBasedTripPlannerSearchComponent.t;
                    StringProvider stringProvider = stopBasedTripPlannerSearchComponent.l;
                    sourceName = UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.getSourceName();
                    if (z2) {
                        this.L$0 = stopBasedTripPlannerSearchComponent;
                        this.L$1 = strA;
                        this.L$2 = sourceName;
                        this.L$3 = chaloNavigationManager2;
                        this.Z$0 = z2;
                        this.label = 1;
                        objB2 = stringProvider.b(StringEnum.ENTER_ORIGIN_LOCATION, new Object[0], this);
                        if (objB2 != coroutineSingletons) {
                            str = strA;
                            z = z2;
                            chaloNavigationManager = chaloNavigationManager2;
                            str2 = (String) objB2;
                            StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent2 = stopBasedTripPlannerSearchComponent;
                            String str4 = str2;
                            String str5 = sourceName;
                            String str6 = stopBasedTripPlannerSearchComponent2.u;
                            Source source = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
                            if (z) {
                                str3 = "stop trip planner start location";
                            } else {
                                str3 = "stop trip planner end location";
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, str4, str5, source, str3, "ACTIVITY_RESULT", str6, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
                        }
                    } else {
                        this.L$0 = stopBasedTripPlannerSearchComponent;
                        this.L$1 = strA;
                        this.L$2 = sourceName;
                        this.L$3 = chaloNavigationManager2;
                        this.Z$0 = z2;
                        this.label = 2;
                        objB = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[0], this);
                        if (objB != coroutineSingletons) {
                            str = strA;
                            z = z2;
                            chaloNavigationManager = chaloNavigationManager2;
                            str2 = (String) objB;
                            StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent3 = stopBasedTripPlannerSearchComponent;
                            String str7 = str2;
                            String str8 = sourceName;
                            String str9 = stopBasedTripPlannerSearchComponent3.u;
                            Source source2 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
                            if (z) {
                                str3 = "stop trip planner start location";
                            } else {
                                str3 = "stop trip planner end location";
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, str7, str8, source2, str3, "ACTIVITY_RESULT", str9, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
                        }
                    }
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                z = this.Z$0;
                chaloNavigationManager = (ChaloNavigationManager) this.L$3;
                String str10 = (String) this.L$2;
                str = (String) this.L$1;
                stopBasedTripPlannerSearchComponent = (StopBasedTripPlannerSearchComponent) this.L$0;
                ResultKt.b(obj);
                sourceName = str10;
                objB2 = obj;
                str2 = (String) objB2;
                StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent4 = stopBasedTripPlannerSearchComponent;
                String str11 = str2;
                String str12 = sourceName;
                String str13 = stopBasedTripPlannerSearchComponent4.u;
                Source source3 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
                if (z) {
                    str3 = "stop trip planner start location";
                } else {
                    str3 = "stop trip planner end location";
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, str11, str12, source3, str3, "ACTIVITY_RESULT", str13, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                chaloNavigationManager = (ChaloNavigationManager) this.L$3;
                String str14 = (String) this.L$2;
                str = (String) this.L$1;
                stopBasedTripPlannerSearchComponent = (StopBasedTripPlannerSearchComponent) this.L$0;
                ResultKt.b(obj);
                sourceName = str14;
                objB = obj;
                str2 = (String) objB;
                StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent5 = stopBasedTripPlannerSearchComponent;
                String str15 = str2;
                String str16 = sourceName;
                String str17 = stopBasedTripPlannerSearchComponent5.u;
                Source source4 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
                if (z) {
                    str3 = "stop trip planner start location";
                } else {
                    str3 = "stop trip planner end location";
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, str15, str16, source4, str3, "ACTIVITY_RESULT", str17, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, UniversalSearchOptions universalSearchOptions, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = stopBasedTripPlannerSearchComponent;
        this.$searchOptions = universalSearchOptions;
        this.$forFromStop = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1 stopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1 = new StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1(this.this$0, this.$searchOptions, continuation, this.$forFromStop);
        stopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1.L$0 = obj;
        return stopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1 stopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1 = (StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        stopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$searchOptions, null, this.$forFromStop), 3);
        return Unit.f17538a;
    }
}
