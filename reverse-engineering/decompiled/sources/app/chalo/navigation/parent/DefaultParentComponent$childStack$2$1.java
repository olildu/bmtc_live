package app.chalo.navigation.parent;

import app.chalo.navigation.child.ChildComponent;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DefaultParentComponent$childStack$2$1 extends FunctionReferenceImpl implements Function2<SceneArgs, ComponentContext, ChildComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SceneArgs p0 = (SceneArgs) obj;
        ComponentContext p1 = (ComponentContext) obj2;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        return ((DefaultParentComponent) this.receiver).m(p0, p1);
    }
}
