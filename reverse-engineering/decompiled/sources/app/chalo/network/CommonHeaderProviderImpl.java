package app.chalo.network;

import app.chalo.Device;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.utils.PlatformFeature;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/CommonHeaderProviderImpl;", "Lapp/chalo/network/CommonHeaderProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonHeaderProviderImpl implements CommonHeaderProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Device f6452a;
    public final ChaloBuildConfig b;

    public CommonHeaderProviderImpl(Device device, ChaloBuildConfig chaloBuildConfig) {
        this.f6452a = device;
        this.b = chaloBuildConfig;
    }

    @Override // app.chalo.network.CommonHeaderProvider
    public final String a() {
        return String.valueOf(this.b.e());
    }

    @Override // app.chalo.network.CommonHeaderProvider
    public final String getClientId() {
        return this.b.k();
    }

    @Override // app.chalo.network.CommonHeaderProvider
    public final String getDeviceId() {
        return this.f6452a.getDeviceId();
    }

    @Override // app.chalo.network.CommonHeaderProvider
    public final void getSource() {
        float f = PlatformFeature.f10436a;
    }
}
