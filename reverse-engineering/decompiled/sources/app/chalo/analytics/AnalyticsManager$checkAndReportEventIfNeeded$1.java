package app.chalo.analytics;

import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.analytics.events.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.analytics.AnalyticsManager$checkAndReportEventIfNeeded$1", f = "AnalyticsManager.kt", l = {67, EACTags.DISPLAY_IMAGE}, m = "invokeSuspend", v = 1)
final class AnalyticsManager$checkAndReportEventIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnalyticsEvent $event;
    int label;
    final /* synthetic */ AnalyticsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsManager$checkAndReportEventIfNeeded$1(AnalyticsManager analyticsManager, AnalyticsEvent analyticsEvent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = analyticsManager;
        this.$event = analyticsEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsManager$checkAndReportEventIfNeeded$1(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsManager$checkAndReportEventIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsManager analyticsManager = this.this$0;
            AnalyticsEvent analyticsEvent = this.$event;
            this.label = 1;
            obj = AnalyticsManager.a(analyticsManager, analyticsEvent, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            this.this$0.c(this.$event);
            AnalyticsManager analyticsManager2 = this.this$0;
            String str = this.$event.f876a;
            this.label = 2;
            Object objEdit = PreferencesKt.edit(analyticsManager2.b, new AnalyticsManager$setLastReportedTime$2(str, analyticsManager2, null), this);
            if (objEdit != coroutineSingletons) {
                objEdit = unit;
            }
            if (objEdit == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
