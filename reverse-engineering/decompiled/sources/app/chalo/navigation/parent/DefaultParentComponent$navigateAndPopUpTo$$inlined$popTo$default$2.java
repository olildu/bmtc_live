package app.chalo.navigation.parent;

import app.chalo.scenes.args.SceneArgs;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class DefaultParentComponent$navigateAndPopUpTo$$inlined$popTo$default$2 implements Function2<List<SceneArgs>, List<SceneArgs>, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xs.x((List) obj, "newStack", (List) obj2, "oldStack");
        return Unit.f17538a;
    }
}
