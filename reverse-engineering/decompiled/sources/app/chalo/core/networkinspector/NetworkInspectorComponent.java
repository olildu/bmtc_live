package app.chalo.core.networkinspector;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.NetworkInspectorArgs;
import com.android.volley.toolbox.HttpHeaderParser;
import com.arkivanov.decompose.ComponentContext;
import defpackage.im0;
import defpackage.wi0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "Lapp/chalo/core/networkinspector/NetworkInspectorState;", "Lapp/chalo/core/networkinspector/NetworkInspectorSideEffect;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkInspectorComponent extends ChaloBaseStateMviComponent<NetworkInspectorIntent, NetworkInspectorState, NetworkInspectorState, NetworkInspectorSideEffect> {
    public final ChaloNavigationManager k;
    public final ChaloInternalNetworkInspector l;
    public final ChaloBuildConfig m;
    public final KotlinToastManager n;

    public NetworkInspectorComponent(ComponentContext componentContext, NetworkInspectorArgs networkInspectorArgs, ChaloNavigationManager chaloNavigationManager, ChaloInternalNetworkInspector chaloInternalNetworkInspector, ChaloBuildConfig chaloBuildConfig, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = chaloNavigationManager;
        this.l = chaloInternalNetworkInspector;
        this.m = chaloBuildConfig;
        this.n = kotlinToastManager;
        if (chaloBuildConfig.n()) {
            F0(NetworkInspectorIntent.InitialLoad.f2300a);
        } else {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        }
    }

    public final void F0(NetworkInspectorIntent networkInspectorIntent) {
        String str;
        C0(networkInspectorIntent);
        boolean zEquals = networkInspectorIntent.equals(NetworkInspectorIntent.InitialLoad.f2300a);
        ContextScope contextScope = this.j;
        StateFlow stateFlow = this.f;
        if (zEquals) {
            if (((NetworkInspectorState) stateFlow.getValue()).c) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new NetworkInspectorComponent$refresh$1(this, null), 3);
            return;
        }
        if (networkInspectorIntent.equals(NetworkInspectorIntent.Refresh.f2303a)) {
            if (((NetworkInspectorState) stateFlow.getValue()).c) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new NetworkInspectorComponent$refresh$1(this, null), 3);
            return;
        }
        if (networkInspectorIntent.equals(NetworkInspectorIntent.CloseDetails.f2298a)) {
            E0(new im0(16));
            return;
        }
        if (networkInspectorIntent.equals(NetworkInspectorIntent.OnBackClicked.f2301a)) {
            if (((NetworkInspectorState) stateFlow.getValue()).b != null) {
                E0(new im0(17));
                return;
            } else {
                ChaloNavigationManagerKt.c(this.k);
                return;
            }
        }
        if (networkInspectorIntent instanceof NetworkInspectorIntent.OpenDetails) {
            E0(new wi0(networkInspectorIntent, 27));
            return;
        }
        if (!(networkInspectorIntent instanceof NetworkInspectorIntent.CopyCurlClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        NetworkCallInfo info = ((NetworkInspectorIntent.CopyCurlClicked) networkInspectorIntent).f2299a;
        Intrinsics.i(info, "info");
        String str2 = info.f;
        StringBuilder sb = new StringBuilder("curl ");
        sb.append("-X " + info.e.f16800a + " \\\n");
        LinkedHashMap linkedHashMap = info.d;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int size = ((List) entry.getValue()).size();
            if (size == 0) {
                str = "";
            } else if (size != 1) {
                str = "-H \"" + entry.getKey() + ": " + CollectionsKt.O((Iterable) entry.getValue(), ", ", "[", "]", null, 56) + "\" \\\n";
            } else {
                str = "-H \"" + entry.getKey() + ": " + CollectionsKt.F((List) entry.getValue()) + "\" \\\n";
            }
            if (str.length() > 0) {
                sb.append(str);
            }
        }
        if (str2 != null && str2.length() != 0 && !str2.equals("EmptyContent")) {
            if (!linkedHashMap.containsKey(HttpHeaderParser.HEADER_CONTENT_TYPE) && !linkedHashMap.containsKey("content-type")) {
                sb.append("-H \"Content-Type: application/json\" \\\n");
            }
            sb.append("-d '" + str2 + "' \\\n");
        }
        sb.append("'" + info.b + "'");
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        r0(new NetworkInspectorSideEffect.CopyCurl(string));
        KotlinToastManagerKt.a(this.n, "cURL copied", ToastLength.SHORT);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (NetworkInspectorState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new NetworkInspectorState(EmptyList.f17557a, null, false, null);
    }
}
