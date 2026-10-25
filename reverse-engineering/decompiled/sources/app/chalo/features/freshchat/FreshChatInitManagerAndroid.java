package app.chalo.features.freshchat;

import android.content.Context;
import android.os.Bundle;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import com.freshchat.consumer.sdk.Freshchat;
import com.freshchat.consumer.sdk.FreshchatConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/FreshChatInitManagerAndroid;", "Lapp/chalo/features/freshchat/FreshChatInitManager;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshChatInitManagerAndroid implements FreshChatInitManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2714a;
    public final SdkIntegrationPolicyManager b;

    public FreshChatInitManagerAndroid(Context context, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        Intrinsics.i(sdkIntegrationPolicyManager, "sdkIntegrationPolicyManager");
        this.f2714a = context;
        this.b = sdkIntegrationPolicyManager;
    }

    @Override // app.chalo.features.freshchat.FreshChatInitManager
    public final Unit a() {
        boolean z = this.b.f1078a.d;
        Unit unit = Unit.f17538a;
        if (!z) {
            return unit;
        }
        FreshchatConfig freshchatConfig = new FreshchatConfig("18ae4e04-269d-4dc0-85e3-d14022ccdc08", "de78c85f-3a31-4de4-ba6a-f2a2a5d758b9");
        freshchatConfig.setCameraCaptureEnabled(true);
        freshchatConfig.setGallerySelectionEnabled(true);
        freshchatConfig.setTeamMemberInfoVisible(true);
        Freshchat.getInstance(this.f2714a).init(freshchatConfig);
        return unit;
    }

    @Override // app.chalo.features.freshchat.FreshChatInitManager
    public final void b(String token) {
        Intrinsics.i(token, "token");
        if (this.b.f1078a.d) {
            Freshchat.getInstance(this.f2714a).setPushRegistrationToken(token);
        }
    }

    @Override // app.chalo.features.freshchat.FreshChatInitManager
    public final boolean c(Map map) {
        if (!this.b.f1078a.d) {
            return false;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        bundle.remove("from");
        if (!Freshchat.isFreshchatNotification(bundle)) {
            return false;
        }
        Freshchat.handleFcmMessage(this.f2714a, bundle);
        return true;
    }
}
