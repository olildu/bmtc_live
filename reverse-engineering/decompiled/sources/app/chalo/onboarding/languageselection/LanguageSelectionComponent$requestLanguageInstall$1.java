package app.chalo.onboarding.languageselection;

import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "app.chalo.onboarding.languageselection.LanguageSelectionComponent$requestLanguageInstall$1", f = "LanguageSelectionComponent.kt", l = {260}, m = "invokeSuspend", v = 1)
final class LanguageSelectionComponent$requestLanguageInstall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $locale;
    int label;
    final /* synthetic */ LanguageSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionComponent$requestLanguageInstall$1(LanguageSelectionComponent languageSelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = languageSelectionComponent;
        this.$locale = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageSelectionComponent$requestLanguageInstall$1(this.this$0, this.$locale, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageSelectionComponent$requestLanguageInstall$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SplitInstallHandler splitInstallHandler = this.this$0.n;
            List listR = CollectionsKt.R(this.$locale);
            this.label = 1;
            obj = splitInstallHandler.c(listR, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            LanguageSelectionComponent languageSelectionComponent = this.this$0;
            BuildersKt.d(languageSelectionComponent.j, null, null, new LanguageSelectionComponent$handleLanguageInstallFailure$1(languageSelectionComponent, null), 3);
        }
        return Unit.f17538a;
    }
}
