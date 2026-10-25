package app.chalo.fileupload.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult;", "", "UploadedSuccessfully", "ServerError", "LocalError", "InvalidImageUrlReceivedError", "ResponseParseError", "Lapp/chalo/fileupload/domain/UploadImageResult$InvalidImageUrlReceivedError;", "Lapp/chalo/fileupload/domain/UploadImageResult$LocalError;", "Lapp/chalo/fileupload/domain/UploadImageResult$ResponseParseError;", "Lapp/chalo/fileupload/domain/UploadImageResult$ServerError;", "Lapp/chalo/fileupload/domain/UploadImageResult$UploadedSuccessfully;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UploadImageResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult$InvalidImageUrlReceivedError;", "Lapp/chalo/fileupload/domain/UploadImageResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidImageUrlReceivedError extends UploadImageResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidImageUrlReceivedError f2778a = new InvalidImageUrlReceivedError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult$LocalError;", "Lapp/chalo/fileupload/domain/UploadImageResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends UploadImageResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f2779a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult$ResponseParseError;", "Lapp/chalo/fileupload/domain/UploadImageResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParseError extends UploadImageResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParseError f2780a = new ResponseParseError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult$ServerError;", "Lapp/chalo/fileupload/domain/UploadImageResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends UploadImageResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ServerError(errorMsg=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadImageResult$UploadedSuccessfully;", "Lapp/chalo/fileupload/domain/UploadImageResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadedSuccessfully extends UploadImageResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2781a;

        public UploadedSuccessfully(String imageUrl) {
            Intrinsics.i(imageUrl, "imageUrl");
            this.f2781a = imageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadedSuccessfully) && Intrinsics.d(this.f2781a, ((UploadedSuccessfully) obj).f2781a);
        }

        public final int hashCode() {
            return this.f2781a.hashCode();
        }

        public final String toString() {
            return vo1.B("UploadedSuccessfully(imageUrl=", this.f2781a, ")");
        }
    }
}
