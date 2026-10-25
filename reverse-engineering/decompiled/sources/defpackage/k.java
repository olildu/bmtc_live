package defpackage;

import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.common.base.Function;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Network;
import com.google.common.graph.ValueGraph;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17451a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.f17451a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f17451a) {
            case 0:
                return ((Network) this.b).l(obj);
            case 1:
                EndpointPair endpointPair = (EndpointPair) obj;
                Object objJ = ((ValueGraph) this.b).j(endpointPair.f13978a, endpointPair.b);
                Objects.requireNonNull(objJ);
                return objJ;
            default:
                return ((FragmentedMp4Extractor) this.b).modifyTrack((Track) obj);
        }
    }
}
