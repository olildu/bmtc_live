package app.chalo.core.navigation.root;

import app.chalo.scenes.args.SceneArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class DefaultRootComponent$finishParentFlow$$inlined$pop$default$1 implements Function1<List<? extends SceneArgs>, List<? extends SceneArgs>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultRootComponent$finishParentFlow$$inlined$pop$default$1 f2186a = new DefaultRootComponent$finishParentFlow$$inlined$pop$default$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listB;
        List stack = (List) obj;
        Intrinsics.i(stack, "stack");
        List list = stack.size() > 1 ? stack : null;
        return (list == null || (listB = CollectionsKt.B(list)) == null) ? stack : listB;
    }
}
