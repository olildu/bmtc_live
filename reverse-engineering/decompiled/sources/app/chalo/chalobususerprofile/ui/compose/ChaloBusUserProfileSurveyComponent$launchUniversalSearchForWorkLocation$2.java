package app.chalo.chalobususerprofile.ui.compose;

import defpackage.ci;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ChaloBusUserProfileSurveyComponent$launchUniversalSearchForWorkLocation$2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent = (ChaloBusUserProfileSurveyComponent) this.receiver;
        chaloBusUserProfileSurveyComponent.getClass();
        Object objC = CoroutineScopeKt.c(new ChaloBusUserProfileSurveyComponent$collectLocationResult$2(chaloBusUserProfileSurveyComponent, (String) obj, new ci(chaloBusUserProfileSurveyComponent, 0), null), (Continuation) obj2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objC != coroutineSingletons) {
            objC = unit;
        }
        return objC == coroutineSingletons ? objC : unit;
    }
}
