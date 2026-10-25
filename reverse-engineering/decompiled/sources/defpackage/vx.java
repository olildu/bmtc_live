package defpackage;

import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.text.TextOutput;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vx implements TextOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19874a;

    public /* synthetic */ vx(int i) {
        this.f19874a = i;
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        switch (this.f19874a) {
            case 0:
                DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
                break;
            default:
                DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public final /* synthetic */ void onCues(List list) {
        int i = this.f19874a;
        qi1.a(this, list);
    }
}
