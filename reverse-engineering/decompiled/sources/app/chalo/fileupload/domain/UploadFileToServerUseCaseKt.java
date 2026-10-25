package app.chalo.fileupload.domain;

import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UploadFileToServerUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2777a;

        static {
            int[] iArr = new int[UploadFileFailureReason.values().length];
            try {
                iArr[UploadFileFailureReason.SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadFileFailureReason.UNKNOWN_LOCAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadFileFailureReason.INVALID_URL_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadFileFailureReason.RESPONSE_PARSE_EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2777a = iArr;
        }
    }

    public static final UploadImageResult a(ChaloUseCaseResult chaloUseCaseResult) {
        Intrinsics.i(chaloUseCaseResult, "<this>");
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new UploadImageResult.UploadedSuccessfully((String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.f2777a[((UploadFileFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i == 1) {
            return new UploadImageResult.ServerError();
        }
        if (i == 2) {
            return UploadImageResult.LocalError.f2779a;
        }
        if (i == 3) {
            return UploadImageResult.InvalidImageUrlReceivedError.f2778a;
        }
        if (i == 4) {
            return UploadImageResult.ResponseParseError.f2780a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
