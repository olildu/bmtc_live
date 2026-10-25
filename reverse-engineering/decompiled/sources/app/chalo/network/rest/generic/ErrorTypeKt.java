package app.chalo.network.rest.generic;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorTypeKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6511a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.TYPE_CLIENT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.TYPE_COMMON_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorType.TYPE_NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorType.TYPE_NO_INTERNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorType.TYPE_NO_UPDATE_IN_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorType.TYPE_NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorType.TYPE_REQUEST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorType.TYPE_SERVER_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorType.TYPE_TIMEOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ErrorType.TYPE_UNAUTHORIZED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ErrorType.TYPE_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f6511a = iArr;
        }
    }

    public static final int a(ErrorType errorType) {
        Intrinsics.i(errorType, "<this>");
        switch (WhenMappings.f6511a[errorType.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 7000;
            case 3:
                return 3000;
            case 4:
                return 5000;
            case 5:
                return 10000;
            case 6:
                return 0;
            case 7:
                return 6000;
            case 8:
                return 4000;
            case 9:
                return 8000;
            case 10:
                return 1000;
            case 11:
                return 9000;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
