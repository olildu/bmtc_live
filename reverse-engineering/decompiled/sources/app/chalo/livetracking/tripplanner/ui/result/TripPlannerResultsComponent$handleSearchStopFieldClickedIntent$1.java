package app.chalo.livetracking.tripplanner.ui.result;

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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1", f = "TripPlannerResultsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent $intent;
    final /* synthetic */ String $requestId;
    final /* synthetic */ UniversalSearchOptions $searchOptions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1$1", f = "TripPlannerResultsComponent.kt", l = {362}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ TripPlannerResultsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TripPlannerResultsComponent tripPlannerResultsComponent, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tripPlannerResultsComponent;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$requestId, continuation);
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
                TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
                String str = this.$requestId;
                this.label = 1;
                if (TripPlannerResultsComponent.F0(tripPlannerResultsComponent, str, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1$2", f = "TripPlannerResultsComponent.kt", l = {371, 371}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent $intent;
        final /* synthetic */ String $requestId;
        final /* synthetic */ UniversalSearchOptions $searchOptions;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ TripPlannerResultsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent, TripPlannerResultsComponent tripPlannerResultsComponent, UniversalSearchOptions universalSearchOptions, String str, Continuation continuation) {
            super(2, continuation);
            this.$searchOptions = universalSearchOptions;
            this.this$0 = tripPlannerResultsComponent;
            this.$intent = searchStopUpdateFieldClickedIntent;
            this.$requestId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            UniversalSearchOptions universalSearchOptions = this.$searchOptions;
            return new AnonymousClass2(this.$intent, this.this$0, universalSearchOptions, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strA;
            String str;
            Object objB;
            String str2;
            TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent;
            ChaloNavigationManager chaloNavigationManager;
            String str3;
            Object objB2;
            String str4;
            TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent2;
            String str5;
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
                    TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
                    TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent3 = this.$intent;
                    str = this.$requestId;
                    ChaloNavigationManager chaloNavigationManager2 = tripPlannerResultsComponent.C;
                    StringProvider stringProvider = tripPlannerResultsComponent.o;
                    String sourceName = UniversalSearchFlowSource.TRIP_PLANNER.getSourceName();
                    if (searchStopUpdateFieldClickedIntent3.f4780a) {
                        this.L$0 = searchStopUpdateFieldClickedIntent3;
                        this.L$1 = str;
                        this.L$2 = strA;
                        this.L$3 = sourceName;
                        this.L$4 = chaloNavigationManager2;
                        this.label = 1;
                        objB2 = stringProvider.b(StringEnum.ENTER_ORIGIN_LOCATION, new Object[0], this);
                        if (objB2 != coroutineSingletons) {
                            str2 = strA;
                            searchStopUpdateFieldClickedIntent = searchStopUpdateFieldClickedIntent3;
                            chaloNavigationManager = chaloNavigationManager2;
                            str3 = sourceName;
                            str4 = (String) objB2;
                            String str6 = str3;
                            searchStopUpdateFieldClickedIntent2 = searchStopUpdateFieldClickedIntent;
                            String str7 = str;
                            String str8 = str4;
                            Source source = Source.TRIP_PLANNER;
                            if (searchStopUpdateFieldClickedIntent2.f4780a) {
                                str5 = "trip planner start location";
                            } else {
                                str5 = "trip planner end location";
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str2, str8, str6, source, str5, "ACTIVITY_RESULT", str7, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
                        }
                    } else {
                        this.L$0 = searchStopUpdateFieldClickedIntent3;
                        this.L$1 = str;
                        this.L$2 = strA;
                        this.L$3 = sourceName;
                        this.L$4 = chaloNavigationManager2;
                        this.label = 2;
                        objB = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[0], this);
                        if (objB != coroutineSingletons) {
                            str2 = strA;
                            searchStopUpdateFieldClickedIntent = searchStopUpdateFieldClickedIntent3;
                            chaloNavigationManager = chaloNavigationManager2;
                            str3 = sourceName;
                            str4 = (String) objB;
                            String str9 = str3;
                            searchStopUpdateFieldClickedIntent2 = searchStopUpdateFieldClickedIntent;
                            String str10 = str;
                            String str11 = str4;
                            Source source2 = Source.TRIP_PLANNER;
                            if (searchStopUpdateFieldClickedIntent2.f4780a) {
                                str5 = "trip planner start location";
                            } else {
                                str5 = "trip planner end location";
                            }
                            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str2, str11, str9, source2, str5, "ACTIVITY_RESULT", str10, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
                        }
                    }
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                chaloNavigationManager = (ChaloNavigationManager) this.L$4;
                str3 = (String) this.L$3;
                String str12 = (String) this.L$2;
                String str13 = (String) this.L$1;
                searchStopUpdateFieldClickedIntent = (TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent) this.L$0;
                ResultKt.b(obj);
                str = str13;
                str2 = str12;
                objB2 = obj;
                str4 = (String) objB2;
                String str14 = str3;
                searchStopUpdateFieldClickedIntent2 = searchStopUpdateFieldClickedIntent;
                String str15 = str;
                String str16 = str4;
                Source source3 = Source.TRIP_PLANNER;
                if (searchStopUpdateFieldClickedIntent2.f4780a) {
                    str5 = "trip planner start location";
                } else {
                    str5 = "trip planner end location";
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str2, str16, str14, source3, str5, "ACTIVITY_RESULT", str15, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$4;
                str3 = (String) this.L$3;
                String str17 = (String) this.L$2;
                String str18 = (String) this.L$1;
                searchStopUpdateFieldClickedIntent = (TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent) this.L$0;
                ResultKt.b(obj);
                str = str18;
                str2 = str17;
                objB = obj;
                str4 = (String) objB;
                String str19 = str3;
                searchStopUpdateFieldClickedIntent2 = searchStopUpdateFieldClickedIntent;
                String str110 = str;
                String str111 = str4;
                Source source4 = Source.TRIP_PLANNER;
                if (searchStopUpdateFieldClickedIntent2.f4780a) {
                    str5 = "trip planner start location";
                } else {
                    str5 = "trip planner end location";
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str2, str111, str19, source4, str5, "ACTIVITY_RESULT", str110, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1(TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent, TripPlannerResultsComponent tripPlannerResultsComponent, UniversalSearchOptions universalSearchOptions, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$requestId = str;
        this.$searchOptions = universalSearchOptions;
        this.$intent = searchStopUpdateFieldClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
        String str = this.$requestId;
        TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1 tripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1 = new TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1(this.$intent, tripPlannerResultsComponent, this.$searchOptions, str, continuation);
        tripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1.L$0 = obj;
        return tripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1 tripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1 = (TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        tripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1.invokeSuspend(unit);
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
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$requestId, null), 3);
        UniversalSearchOptions universalSearchOptions = this.$searchOptions;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.$intent, this.this$0, universalSearchOptions, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}
