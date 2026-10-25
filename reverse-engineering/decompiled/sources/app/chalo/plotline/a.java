package app.chalo.plotline;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlotlineContractImpl f6845a;

    public /* synthetic */ a(PlotlineContractImpl plotlineContractImpl) {
        this.f6845a = plotlineContractImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        PlotlineContractImpl plotlineContractImpl = this.f6845a;
        plotlineContractImpl.h.invoke(map);
        if (map != null && map.containsKey("customAction")) {
            BuildersKt.d(plotlineContractImpl.p, plotlineContractImpl.f.a(), null, new PlotlineContractImpl$setupPlotline$2$1$1(plotlineContractImpl, map, null), 2);
        }
        return Unit.f17538a;
    }
}
