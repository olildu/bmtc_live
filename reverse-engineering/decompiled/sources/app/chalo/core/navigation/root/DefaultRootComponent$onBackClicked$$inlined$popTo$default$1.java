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
public final class DefaultRootComponent$onBackClicked$$inlined$popTo$default$1 implements Function1<List<? extends SceneArgs>, List<? extends SceneArgs>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.i(it, "it");
        return CollectionsKt.x0(it, 1);
    }
}
