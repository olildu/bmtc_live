package app.chalo.livetracking.utils;

import app.chalo.buildconfig.Platform;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.amazon.device.ads.DtbDeviceData;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/utils/TrackingUtils;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackingUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TrackingUtils f5112a = new TrackingUtils();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5113a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Platform.values().length];
            try {
                iArr[Platform.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Platform.IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5113a = iArr;
            int[] iArr2 = new int[ChaloTransitMode.values().length];
            try {
                iArr2[ChaloTransitMode.TRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloTransitMode.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloTransitMode.MONORAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloTransitMode.BUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public static String a(long j, TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        return j < 60 ? "1 min" : timeUtilsContract.w(j * ((long) 1000));
    }

    public static IconType b(ChaloTransitMode chaloTransitMode) {
        int i = chaloTransitMode == null ? -1 : WhenMappings.b[chaloTransitMode.ordinal()];
        if (i == 1) {
            return IconType.TRAIN_NEARBY_CARD_ITEM_ICON;
        }
        if (i == 2) {
            return IconType.METRO_NEARBY_CARD_ITEM_ICON;
        }
        if (i == 3) {
            return IconType.MONORAIL_NEARBY_CARD_ITEM_ICON;
        }
        if (i != 4) {
            return i != 5 ? IconType.TRAIN_HOMESCREEN : IconType.FERRY_NEARBY_CARD_ITEM_ICON;
        }
        return IconType.BUS_NEARBY_CARD_ITEM_ICON;
    }

    public static IconType c(ChaloTransitMode chaloTransitMode) {
        int i = chaloTransitMode == null ? -1 : WhenMappings.b[chaloTransitMode.ordinal()];
        if (i == 1) {
            return IconType.TRAIN_SEARCH;
        }
        if (i == 2) {
            return IconType.METRO_UNIVERSAL_SEARCH;
        }
        if (i == 3) {
            return IconType.MONORAIL_SEARCH;
        }
        if (i != 4) {
            return i != 5 ? IconType.BUS_SEARCH : IconType.FERRY_SEARCH;
        }
        return IconType.BUS_UNIVERSAL_SEARCH;
    }

    public static JsonObject d(String str, String str2, String str3, String str4, String str5, String str6, Platform platform) {
        Intrinsics.i(platform, "platform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("userId", JsonElementKt.b(str));
        }
        if (str2 != null) {
            linkedHashMap.put("city", JsonElementKt.b(str2));
        }
        if (str5 != null) {
            linkedHashMap.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, JsonElementKt.b(str5));
        }
        linkedHashMap.put("language", JsonElementKt.b(str6));
        int i = WhenMappings.f5113a[platform.ordinal()];
        if (i == 1) {
            if (str3 != null) {
                linkedHashMap.put("androidModel", JsonElementKt.b(str3));
            }
            if (str4 != null) {
                linkedHashMap.put("androidVersionCode", JsonElementKt.b(str4));
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str3 != null) {
                linkedHashMap.put("iosModel", JsonElementKt.b(str3));
            }
            if (str4 != null) {
                linkedHashMap.put("versionCode", JsonElementKt.b(str4));
            }
        }
        try {
            return new JsonObject(linkedHashMap);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonObject e(int i, int i2, String str, String str2, String str3, String str4, String androidModel) {
        Intrinsics.i(androidModel, "androidModel");
        JsonObject jsonObjectF = f(i, str, str2, str3);
        if (jsonObjectF == null) {
            return null;
        }
        LinkedHashMap linkedHashMapU = MapsKt.u(jsonObjectF);
        linkedHashMapU.put("city", JsonElementKt.b(str4));
        linkedHashMapU.put("androidModel", JsonElementKt.b(androidModel));
        linkedHashMapU.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, JsonElementKt.a(Integer.valueOf(i2)));
        return new JsonObject(linkedHashMapU);
    }

    public static JsonObject f(int i, String str, String str2, String currentLanguage) {
        Intrinsics.i(currentLanguage, "currentLanguage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("userId", JsonElementKt.b(str));
            linkedHashMap.put(CLConstants.SALT_FIELD_DEVICE_ID, JsonElementKt.b(str2));
            linkedHashMap.put("language", JsonElementKt.b(currentLanguage));
            float f = PlatformFeature.f10436a;
            linkedHashMap.put("androidVersionCode", JsonElementKt.a(Integer.valueOf(i)));
            return new JsonObject(linkedHashMap);
        } catch (Exception unused) {
            return null;
        }
    }
}
