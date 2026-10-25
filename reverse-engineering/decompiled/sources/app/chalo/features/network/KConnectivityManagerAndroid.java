package app.chalo.features.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import defpackage.ym0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/network/KConnectivityManagerAndroid;", "Lapp/chalo/features/network/KConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KConnectivityManagerAndroid extends ConnectivityManager.NetworkCallback implements KConnectivityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2731a;
    public ym0 b;
    public final ConnectivityManager c;

    public KConnectivityManagerAndroid(Context context) {
        this.f2731a = context;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.c = connectivityManager;
        if (Build.VERSION.SDK_INT >= 24) {
            connectivityManager.registerDefaultNetworkCallback(this);
        } else {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this);
        }
    }

    @Override // app.chalo.features.network.KConnectivityManager
    public final NetworkType a() {
        NetworkInfo networkInfo = this.c.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return NetworkType.WIFI;
        }
        if (Build.VERSION.SDK_INT > 29) {
            return NetworkType.CELLULAR;
        }
        Object systemService = this.f2731a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        switch (((TelephonyManager) systemService).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.CELLULAR_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.CELLULAR_3G;
            case 13:
                return NetworkType.CELLULAR_4G;
            default:
                return NetworkType.UNKNOWN;
        }
    }

    @Override // app.chalo.features.network.KConnectivityManager
    public final NetworkConnectionType b() {
        ConnectivityManager connectivityManager = this.c;
        Intrinsics.i(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                NetworkConnectionType networkConnectionType = (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0)) ? NetworkConnectionType.CONNECTED : NetworkConnectionType.DISCONNECTED;
                if (networkConnectionType != null) {
                    return networkConnectionType;
                }
            }
            return NetworkConnectionType.DISCONNECTED;
        } catch (SecurityException unused) {
            return NetworkConnectionType.UNKNOWN;
        }
    }

    @Override // app.chalo.features.network.KConnectivityManager
    public final void c(ym0 ym0Var) {
        this.b = ym0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.i(network, "network");
        super.onAvailable(network);
        ym0 ym0Var = this.b;
        if (ym0Var != null) {
            ym0Var.invoke(NetworkConnectionType.CONNECTED);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.i(network, "network");
        super.onLost(network);
        ym0 ym0Var = this.b;
        if (ym0Var != null) {
            ym0Var.invoke(NetworkConnectionType.DISCONNECTED);
        }
    }
}
