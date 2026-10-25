package app.chalo.navigation.parent;

import app.chalo.navigation.child.ChildComponent;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.value.Value;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/navigation/parent/ParentComponent;", "Lapp/chalo/scenes/args/SceneArgs;", "ARGS", "Lapp/chalo/navigation/child/ChildComponent;", "CHILD", "Lcom/arkivanov/decompose/ComponentContext;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ParentComponent<ARGS extends SceneArgs, CHILD extends ChildComponent> extends ComponentContext {
    boolean Y(SceneArgs sceneArgs);

    boolean b(SceneArgs sceneArgs, SceneArgs sceneArgs2);

    boolean c(SceneArgs sceneArgs);

    boolean d(SceneArgs sceneArgs, ChaloScenes chaloScenes, boolean z);

    boolean e(SceneArgs sceneArgs);

    boolean f(ChaloScenes chaloScenes, boolean z);

    Value g();

    ParentComponent g0();

    boolean h();

    boolean k();

    boolean l(SceneArgs sceneArgs);
}
