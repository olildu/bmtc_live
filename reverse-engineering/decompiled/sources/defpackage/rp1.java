package defpackage;

import androidx.window.area.WindowAreaControllerImpl;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.AbstractC2556l9;
import com.inmobi.media.W8;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rp1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19233a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rp1(int i, int i2, WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer rearDisplayPresentationSessionConsumer, WindowAreaControllerImpl windowAreaControllerImpl) {
        this.b = i;
        this.c = i2;
        this.d = rearDisplayPresentationSessionConsumer;
        this.e = windowAreaControllerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f19233a) {
            case 0:
                WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer.accept$lambda$0(this.b, this.c, (WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer) this.d, (WindowAreaControllerImpl) this.e);
                break;
            default:
                AbstractC2556l9.a((AdConfig.OmidConfig) this.d, this.b, (W8) this.e, this.c);
                break;
        }
    }

    public /* synthetic */ rp1(AdConfig.OmidConfig omidConfig, int i, W8 w8, int i2) {
        this.d = omidConfig;
        this.b = i;
        this.e = w8;
        this.c = i2;
    }
}
