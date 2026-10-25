package app.chalo.premiumbus.data.mappers;

import app.chalo.network.rest.generic.ErrorType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/mappers/CompleteProductConfigFetchExceptionMapper;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompleteProductConfigFetchExceptionMapper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6981a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.TYPE_NO_INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.TYPE_REQUEST_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorType.TYPE_SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorType.TYPE_UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorType.TYPE_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6981a = iArr;
        }
    }
}
