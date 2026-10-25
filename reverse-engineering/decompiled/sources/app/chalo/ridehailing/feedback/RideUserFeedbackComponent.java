package app.chalo.ridehailing.feedback;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import com.arkivanov.decompose.ComponentContext;
import defpackage.z21;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideUserFeedbackComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;", "Lapp/chalo/ridehailing/feedback/RideFeedbackDataState;", "Lapp/chalo/ridehailing/feedback/RideFeedbackViewState;", "Lapp/chalo/ridehailing/feedback/RideFeedbackSideEffects;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideUserFeedbackComponent extends ChaloBaseStateMviComponent<RideFeedbackViewIntents, RideFeedbackDataState, RideFeedbackViewState, RideFeedbackSideEffects> {
    public final BaseRideFeedbackDelegate k;
    public final AnalyticsContract l;

    /* JADX INFO: renamed from: app.chalo.ridehailing.feedback.RideUserFeedbackComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ridehailing.feedback.RideUserFeedbackComponent$1", f = "RideUserFeedbackComponent.kt", l = {20}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RideUserFeedbackComponent.this.new AnonymousClass1(continuation);
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
                final RideUserFeedbackComponent rideUserFeedbackComponent = RideUserFeedbackComponent.this;
                StateFlow stateFlow = rideUserFeedbackComponent.k.g;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.ridehailing.feedback.RideUserFeedbackComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        rideUserFeedbackComponent.E0(new z21((RideFeedbackDataState) obj2, 2));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideUserFeedbackComponent(ComponentContext componentContext, BaseRideFeedbackDelegate baseRideFeedbackDelegate, AnalyticsContract analyticsContract) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        this.k = baseRideFeedbackDelegate;
        this.l = analyticsContract;
        F0(RideFeedbackViewIntents.Initialize.f9159a);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    public final void F0(RideFeedbackViewIntents intent) {
        Source source;
        Object value;
        Intrinsics.i(intent, "intent");
        boolean zEquals = intent.equals(RideFeedbackViewIntents.Initialize.f9159a);
        ContextScope coroutineScope = this.j;
        BaseRideFeedbackDelegate baseRideFeedbackDelegate = this.k;
        if (zEquals) {
            baseRideFeedbackDelegate.getClass();
            Intrinsics.i(coroutineScope, "coroutineScope");
            AnalyticsContractImplKt.b(baseRideFeedbackDelegate.d, "ride feedback screen opened", baseRideFeedbackDelegate.e, baseRideFeedbackDelegate.i(), false, 24);
            BuildersKt.d(coroutineScope, null, null, new BaseRideFeedbackDelegate$initialize$1(baseRideFeedbackDelegate, null), 3);
            return;
        }
        if (intent.equals(RideFeedbackViewIntents.OnAnimationCompletedIntent.f9160a)) {
            baseRideFeedbackDelegate.getClass();
            Intrinsics.i(coroutineScope, "coroutineScope");
            BaseRideFeedbackDelegate.h(baseRideFeedbackDelegate, "ride feedback thank you animation completed");
            BuildersKt.d(coroutineScope, null, null, new BaseRideFeedbackDelegate$onAnimationCompleted$1(baseRideFeedbackDelegate, null), 3);
            return;
        }
        if (intent instanceof RideFeedbackViewIntents.OnFeedbackOtherReasonDescriptionChange) {
            String str = ((RideFeedbackViewIntents.OnFeedbackOtherReasonDescriptionChange) intent).f9161a;
            RideFeedbackDataState it = (RideFeedbackDataState) baseRideFeedbackDelegate.g.getValue();
            Intrinsics.i(it, "it");
            baseRideFeedbackDelegate.k(RideFeedbackDataState.a(it, null, str, false, null, null, 59));
            return;
        }
        int i = 0;
        if (intent instanceof RideFeedbackViewIntents.OnFeedbackRatingReasonClick) {
            baseRideFeedbackDelegate.k((RideFeedbackDataState) new z21(((RideFeedbackViewIntents.OnFeedbackRatingReasonClick) intent).f9162a, i).invoke(baseRideFeedbackDelegate.g.getValue()));
            return;
        }
        if (intent.equals(RideFeedbackViewIntents.OnNeedHelpClick.f9164a)) {
            baseRideFeedbackDelegate.a(coroutineScope);
            return;
        }
        if (intent instanceof RideFeedbackViewIntents.OnFeedbackSubtagClick) {
            String str2 = ((RideFeedbackViewIntents.OnFeedbackSubtagClick) intent).f9163a;
            RideFeedbackDataState current = (RideFeedbackDataState) baseRideFeedbackDelegate.g.getValue();
            Intrinsics.i(current, "current");
            Set set = current.e;
            baseRideFeedbackDelegate.k(RideFeedbackDataState.a(current, null, null, false, set.contains(str2) ? SetsKt.b(set, str2) : SetsKt.f(set, str2), null, 47));
            return;
        }
        if (intent.equals(RideFeedbackViewIntents.OnSeeTripDetailsCardClick.f9165a)) {
            baseRideFeedbackDelegate.b(coroutineScope);
            return;
        }
        if (intent.equals(RideFeedbackViewIntents.OnSkipUserFeedbackCtaClick.f9166a)) {
            baseRideFeedbackDelegate.c(coroutineScope);
            return;
        }
        if (!intent.equals(RideFeedbackViewIntents.OnSubmitFeedbackCtaClick.f9167a)) {
            if (!(intent instanceof RideFeedbackViewIntents.OnUserFeedbackRatingClick)) {
                throw new NoWhenBranchMatchedException();
            }
            UserFeedbackRatingData userFeedbackRatingData = ((RideFeedbackViewIntents.OnUserFeedbackRatingClick) intent).f9168a;
            BookingContext bookingContext = ((RideFeedbackDataState) baseRideFeedbackDelegate.g.getValue()).f9141a;
            if (bookingContext instanceof BookingContext.Auto) {
                source = Source.RIDE_HAILING_USER_FEEDBACK_SCREEN;
            } else {
                if (!(bookingContext instanceof BookingContext.Default) && bookingContext != null) {
                    throw new NoWhenBranchMatchedException();
                }
                source = Source.POST_RIDE_FEEDBACK_SCREEN;
            }
            AnalyticsContractImplKt.b(this.l, "ride feedback rating selected", source, MapsKt.i(new Pair("selectedRating", Integer.valueOf(userFeedbackRatingData.b.getId())), new Pair("maxRating", Integer.valueOf(RideFeedbackContractKt.b(userFeedbackRatingData.b.getId(), ((RideFeedbackDataState) baseRideFeedbackDelegate.g.getValue()).b)))), false, 24);
            baseRideFeedbackDelegate.k((RideFeedbackDataState) new z21(userFeedbackRatingData, 1).invoke(baseRideFeedbackDelegate.g.getValue()));
            return;
        }
        baseRideFeedbackDelegate.getClass();
        Intrinsics.i(coroutineScope, "coroutineScope");
        StateFlow stateFlow = baseRideFeedbackDelegate.g;
        if (((RideFeedbackDataState) stateFlow.getValue()).d) {
            return;
        }
        List list = ((RideFeedbackDataState) stateFlow.getValue()).b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((UserFeedbackRatingData) it2.next()).c) {
                MutableStateFlow mutableStateFlow = baseRideFeedbackDelegate.f;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, RideFeedbackDataState.a((RideFeedbackDataState) value, null, null, true, null, null, 55)));
                BuildersKt.d(coroutineScope, null, null, new BaseRideFeedbackDelegate$onSubmitFeedbackCtaClick$3(baseRideFeedbackDelegate, coroutineScope, null), 3);
                return;
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        RideUserFeedbackComponent$convertToUiState$2 rideUserFeedbackComponent$convertToUiState$2 = new RideUserFeedbackComponent$convertToUiState$2(1, this, RideUserFeedbackComponent.class, "processIntent", "processIntent(Lapp/chalo/ridehailing/feedback/RideFeedbackViewIntents;)V", 0);
        return this.k.d((RideFeedbackDataState) obj, rideUserFeedbackComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new RideFeedbackDataState(null, null, 63);
    }
}
