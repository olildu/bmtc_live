package app.chalo.features.foreground;

import app.chalo.scenes.ChaloScenes;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/foreground/ActiveSceneInStackResolverImpl;", "Lapp/chalo/features/foreground/ActiveSceneInStackResolver;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActiveSceneInStackResolverImpl implements ActiveSceneInStackResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MutableStateFlow f2709a;

    @Override // app.chalo.features.foreground.ActiveSceneInStackResolver
    public final ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1 a() {
        return new ActiveSceneInStackResolverImpl$currentScreenAsFlow$$inlined$map$1(this.f2709a);
    }

    @Override // app.chalo.features.foreground.ActiveSceneInStackResolver
    public final ChaloScenes b() {
        ChaloScenes chaloScenes = (ChaloScenes) this.f2709a.getValue();
        return chaloScenes == null ? ChaloScenes.SplashScreen : chaloScenes;
    }

    @Override // app.chalo.features.foreground.ActiveSceneInStackResolver
    public final void c(ChaloScenes chaloScenes) {
        Object value;
        MutableStateFlow mutableStateFlow = this.f2709a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, chaloScenes));
    }
}
