package app.chalo.onboarding.languageselection.splitinstallhandler;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/AndroidSplitInstallHandler;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallHandler;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSplitInstallHandler implements SplitInstallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitInstallManager f6664a;

    public AndroidSplitInstallHandler(SplitInstallManager splitInstallManager) {
        this.f6664a = splitInstallManager;
    }

    @Override // app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler
    public final Set a() {
        Set setA = this.f6664a.a();
        Intrinsics.h(setA, "getInstalledLanguages(...)");
        return CollectionsKt.G0(setA);
    }

    @Override // app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler
    public final Flow b() {
        return FlowKt.e(new AndroidSplitInstallHandler$getInstallUpdates$1(this, null));
    }

    @Override // app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler
    public final Object c(List list, Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        SplitInstallRequest.Builder builder = new SplitInstallRequest.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.b.add(Locale.forLanguageTag((String) it.next()));
        }
        Task taskB = this.f6664a.b(new SplitInstallRequest(builder));
        final Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler$startInstall$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                safeContinuation.resumeWith(Boolean.TRUE);
                return Unit.f17538a;
            }
        };
        taskB.addOnSuccessListener(new OnSuccessListener() { // from class: app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler$sam$com_google_android_gms_tasks_OnSuccessListener$0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler$startInstall$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it2) {
                Intrinsics.i(it2, "it");
                safeContinuation.resumeWith(Boolean.FALSE);
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }
}
