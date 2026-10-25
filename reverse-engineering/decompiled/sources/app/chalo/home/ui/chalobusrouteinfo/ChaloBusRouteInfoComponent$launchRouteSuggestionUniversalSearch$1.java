package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import defpackage.f;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1", f = "ChaloBusRouteInfoComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $searchOptionsJson;
    final /* synthetic */ RouteSuggestionSearchSource $source;
    final /* synthetic */ UniversalSearchFlowSource $universalSearchFlowSource;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloBusRouteInfoComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1$1", f = "ChaloBusRouteInfoComponent.kt", l = {421}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        final /* synthetic */ String $searchOptionsJson;
        final /* synthetic */ UniversalSearchFlowSource $universalSearchFlowSource;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ChaloBusRouteInfoComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, String str, UniversalSearchFlowSource universalSearchFlowSource, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloBusRouteInfoComponent;
            this.$searchOptionsJson = str;
            this.$universalSearchFlowSource = universalSearchFlowSource;
            this.$requestId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$searchOptionsJson, this.$universalSearchFlowSource, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloNavigationManager chaloNavigationManager;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = this.this$0;
                ChaloNavigationManager chaloNavigationManager2 = chaloBusRouteInfoComponent.m;
                String str2 = this.$searchOptionsJson;
                this.L$0 = chaloNavigationManager2;
                this.L$1 = str2;
                this.label = 1;
                obj = chaloBusRouteInfoComponent.l.b(StringEnum.ENTER_LOCATION, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloNavigationManager = chaloNavigationManager2;
                str = str2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.L$1;
                ChaloNavigationManager chaloNavigationManager3 = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
                chaloNavigationManager = chaloNavigationManager3;
                str = str3;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, (String) obj, this.$universalSearchFlowSource.getSourceName(), Source.CHALO_BUS_ROUTE_INFO_SCREEN, (String) null, "ACTIVITY_RESULT", this.$requestId, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1936), null, null, 6));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, String str, RouteSuggestionSearchSource routeSuggestionSearchSource, String str2, UniversalSearchFlowSource universalSearchFlowSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusRouteInfoComponent;
        this.$requestId = str;
        this.$source = routeSuggestionSearchSource;
        this.$searchOptionsJson = str2;
        this.$universalSearchFlowSource = universalSearchFlowSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1 chaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1 = new ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1(this.this$0, this.$requestId, this.$source, this.$searchOptionsJson, this.$universalSearchFlowSource, continuation);
        chaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1.L$0 = obj;
        return chaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1 chaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1 = (ChaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloBusRouteInfoComponent$launchRouteSuggestionUniversalSearch$1.invokeSuspend(unit);
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
        ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = this.this$0;
        Job jobD = BuildersKt.d(chaloBusRouteInfoComponent.j, null, null, new ChaloBusRouteInfoComponent$collectRouteSuggestionUniversalSearchResult$job$1(chaloBusRouteInfoComponent, this.$requestId, this.$source, null), 3);
        ((JobSupport) jobD).w(new f(22, chaloBusRouteInfoComponent, jobD));
        chaloBusRouteInfoComponent.u = jobD;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$searchOptionsJson, this.$universalSearchFlowSource, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}
