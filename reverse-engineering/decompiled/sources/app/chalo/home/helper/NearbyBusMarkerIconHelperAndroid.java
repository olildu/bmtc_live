package app.chalo.home.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.chalo.R;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.RealTimeRouteInfo;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.ResourceUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/NearbyBusMarkerIconHelperAndroid;", "Lapp/chalo/home/helper/NearbyBusMarkerIconHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyBusMarkerIconHelperAndroid implements NearbyBusMarkerIconHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3105a;
    public final CoroutineContextProvider b;
    public final CrashlyticsLogger c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3106a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f3106a = iArr;
        }
    }

    public NearbyBusMarkerIconHelperAndroid(Context context, CoroutineContextProvider coroutineContextProvider, CrashlyticsLogger errorReporterContract) {
        Intrinsics.i(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.i(errorReporterContract, "errorReporterContract");
        this.f3105a = context;
        this.b = coroutineContextProvider;
        this.c = errorReporterContract;
    }

    public static Bitmap b(ChaloTransitMode chaloTransitMode, CharSequence charSequence, Context context) {
        int i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.new_marker_view, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.mode_description);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.mode_icon);
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
        switch (WhenMappings.f3106a[chaloTransitMode.ordinal()]) {
            case 1:
                i = R.drawable.live_bus;
                break;
            case 2:
                i = R.drawable.live_ferry;
                break;
            case 3:
                i = R.drawable.live_train;
                break;
            case 4:
                i = R.drawable.live_metro;
                break;
            case 5:
                i = R.drawable.live_monorail;
                break;
            case 6:
            case 7:
            case 8:
                i = R.drawable.live_train;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        imageView.setImageResource(i);
        return ResourceUtils.a(viewInflate);
    }

    @Override // app.chalo.home.helper.NearbyBusMarkerIconHelper
    public final Object a(ChaloTransitMode chaloTransitMode, RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo, boolean z, boolean z2, boolean z3, Continuation continuation) {
        return BuildersKt.g(this.b.a(), new NearbyBusMarkerIconHelperAndroid$getBitmap$2(this, chaloTransitMode, geoRealTimeInfo, z, z2, z3, null), continuation);
    }
}
