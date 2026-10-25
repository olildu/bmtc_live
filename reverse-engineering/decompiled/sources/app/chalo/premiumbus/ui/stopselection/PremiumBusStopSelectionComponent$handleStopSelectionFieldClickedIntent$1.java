package app.chalo.premiumbus.ui.stopselection;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1", f = "PremiumBusStopSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent $intent;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $searchOptionsJson;
    final /* synthetic */ Source $stopSearchSource;
    final /* synthetic */ UniversalSearchFlowSource $universalSearchFlowSource;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumBusStopSelectionComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1$1", f = "PremiumBusStopSelectionComponent.kt", l = {626}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent $intent;
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ PremiumBusStopSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, String str, PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent stopSelectionFieldClickedIntent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = premiumBusStopSelectionComponent;
            this.$requestId = str;
            this.$intent = stopSelectionFieldClickedIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$requestId, this.$intent, continuation);
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
                PremiumBusStopSelectionComponent premiumBusStopSelectionComponent = this.this$0;
                String str = this.$requestId;
                PremiumBusStopSearchSource premiumBusStopSearchSource = this.$intent.f7981a;
                this.label = 1;
                if (PremiumBusStopSelectionComponent.F0(premiumBusStopSelectionComponent, str, premiumBusStopSearchSource, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1$2", f = "PremiumBusStopSelectionComponent.kt", l = {634}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        final /* synthetic */ String $searchOptionsJson;
        final /* synthetic */ Source $stopSearchSource;
        final /* synthetic */ UniversalSearchFlowSource $universalSearchFlowSource;
        Object L$0;
        int label;
        final /* synthetic */ PremiumBusStopSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, UniversalSearchFlowSource universalSearchFlowSource, Source source, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = premiumBusStopSelectionComponent;
            this.$universalSearchFlowSource = universalSearchFlowSource;
            this.$stopSearchSource = source;
            this.$searchOptionsJson = str;
            this.$requestId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$universalSearchFlowSource, this.$stopSearchSource, this.$searchOptionsJson, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloNavigationManager chaloNavigationManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                PremiumBusStopSelectionComponent premiumBusStopSelectionComponent = this.this$0;
                ChaloNavigationManager chaloNavigationManager2 = premiumBusStopSelectionComponent.A;
                this.L$0 = chaloNavigationManager2;
                this.label = 1;
                obj = premiumBusStopSelectionComponent.u.b(StringEnum.ENTER_LOCATION, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloNavigationManager = chaloNavigationManager2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(this.$searchOptionsJson, (String) obj, this.$universalSearchFlowSource.getSourceName(), Source.PREMIUM_BUS_STOP_SELECTION_SCREEN, this.$stopSearchSource == Source.PREMIUM_FROM_STOP_SELECTION ? "premium bus start location" : "premium bus end location", "ACTIVITY_RESULT", this.$requestId, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1920), null, null, 6));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, String str, PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent stopSelectionFieldClickedIntent, UniversalSearchFlowSource universalSearchFlowSource, Source source, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusStopSelectionComponent;
        this.$requestId = str;
        this.$intent = stopSelectionFieldClickedIntent;
        this.$universalSearchFlowSource = universalSearchFlowSource;
        this.$stopSearchSource = source;
        this.$searchOptionsJson = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1 premiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1 = new PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1(this.this$0, this.$requestId, this.$intent, this.$universalSearchFlowSource, this.$stopSearchSource, this.$searchOptionsJson, continuation);
        premiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1.L$0 = obj;
        return premiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1 premiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1 = (PremiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusStopSelectionComponent$handleStopSelectionFieldClickedIntent$1.invokeSuspend(unit);
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
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$requestId, this.$intent, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$universalSearchFlowSource, this.$stopSearchSource, this.$searchOptionsJson, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}
