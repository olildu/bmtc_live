package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OriginDestinationApiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8138a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
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
            f8138a = iArr;
        }
    }

    public static final OriginDestinationAdditionalRouteInfoAppModel a(ChaloTransitMode chaloTransitMode, OriginDestinationAdditionalRouteInfoApiModel originDestinationAdditionalRouteInfoApiModel) {
        Intrinsics.i(originDestinationAdditionalRouteInfoApiModel, "originDestinationAdditionalRouteInfoApiModel");
        switch (WhenMappings.f8138a[chaloTransitMode.ordinal()]) {
            case 1:
                String str = originDestinationAdditionalRouteInfoApiModel.f8134a;
                Regex regex = UtilityExtensionsKt.f2619a;
                Intrinsics.i(str, "<this>");
                if (UtilityExtensionsKt.f2619a.h(str)) {
                    return new OriginDestinationAdditionalRouteInfoAppModel.Metro(str);
                }
                return null;
            case 2:
                return OriginDestinationAdditionalRouteInfoAppModel.Bus.b;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
