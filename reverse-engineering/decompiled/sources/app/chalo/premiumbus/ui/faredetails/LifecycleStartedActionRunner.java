package app.chalo.premiumbus.ui.faredetails;

import com.arkivanov.essenty.lifecycle.Lifecycle;
import defpackage.ia;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/LifecycleStartedActionRunner;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsStartedActionRunner;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifecycleStartedActionRunner implements PremiumBusFareDetailsStartedActionRunner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f7546a;

    public LifecycleStartedActionRunner(Lifecycle lifecycle) {
        Intrinsics.i(lifecycle, "lifecycle");
        this.f7546a = lifecycle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, app.chalo.premiumbus.ui.faredetails.LifecycleStartedActionRunner$runWhenStarted$1, com.arkivanov.essenty.lifecycle.Lifecycle$Callbacks] */
    /* JADX WARN: Type inference failed for: r4v2, types: [app.chalo.premiumbus.ui.faredetails.LifecycleStartedActionRunner$runWhenStarted$2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsStartedActionRunner
    public final LifecycleStartedActionRunner$runWhenStarted$2 a(final ia iaVar) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r2 = new Lifecycle.Callbacks() { // from class: app.chalo.premiumbus.ui.faredetails.LifecycleStartedActionRunner$runWhenStarted$1
            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final void onStart() {
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.element) {
                    return;
                }
                booleanRef2.element = true;
                Lifecycle lifecycle = this.f7546a;
                T t = objectRef.element;
                if (t == 0) {
                    Intrinsics.q("callbacks");
                    throw null;
                }
                lifecycle.a((Lifecycle.Callbacks) t);
                iaVar.invoke();
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onCreate() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onDestroy() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onPause() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onResume() {
            }

            @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
            public final /* bridge */ void onStop() {
            }
        };
        objectRef.element = r2;
        this.f7546a.b(r2);
        return new PremiumBusFareDetailsStartedAction() { // from class: app.chalo.premiumbus.ui.faredetails.LifecycleStartedActionRunner$runWhenStarted$2
            @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsStartedAction
            public final void cancel() {
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.element) {
                    return;
                }
                booleanRef2.element = true;
                Lifecycle lifecycle = this.f7546a;
                T t = objectRef.element;
                if (t != 0) {
                    lifecycle.a((Lifecycle.Callbacks) t);
                } else {
                    Intrinsics.q("callbacks");
                    throw null;
                }
            }
        };
    }
}
