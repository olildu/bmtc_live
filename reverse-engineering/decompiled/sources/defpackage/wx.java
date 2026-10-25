package defpackage;

import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.offline.DownloadHelper;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wx implements MetadataOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19967a;

    public /* synthetic */ wx(int i) {
        this.f19967a = i;
    }

    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        switch (this.f19967a) {
            case 0:
                DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
                break;
            default:
                DownloadHelper.lambda$getRendererCapabilities$1(metadata);
                break;
        }
    }
}
