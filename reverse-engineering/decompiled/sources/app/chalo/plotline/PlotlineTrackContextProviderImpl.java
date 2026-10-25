package app.chalo.plotline;

import android.content.Context;
import app.chalo.compose.utils.CommonContext;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/plotline/PlotlineTrackContextProviderImpl;", "Lapp/chalo/plotline/PlotlineTrackContextProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlotlineTrackContextProviderImpl implements PlotlineTrackContextProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonContext f6843a;
    public PlotlineTrackContext b;

    public PlotlineTrackContextProviderImpl(CommonContext commonContext) {
        this.f6843a = commonContext;
    }

    @Override // app.chalo.plotline.PlotlineTrackContextProvider
    public final void a(PlotlineTrackContext plotlineTrackContext) {
        this.b = plotlineTrackContext;
    }

    @Override // app.chalo.plotline.PlotlineTrackContextProvider
    public final Context b() {
        PlotlineTrackContext plotlineTrackContext = this.b;
        if (plotlineTrackContext == null) {
            plotlineTrackContext = new PlotlineTrackContext(this.f6843a);
        }
        return plotlineTrackContext.f6842a.f1927a;
    }
}
