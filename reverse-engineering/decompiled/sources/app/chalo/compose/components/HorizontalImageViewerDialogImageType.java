package app.chalo.compose.components;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType;", "", "Url", "Resource", "Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType$Resource;", "Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType$Url;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HorizontalImageViewerDialogImageType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType$Resource;", "Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Resource extends HorizontalImageViewerDialogImageType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Resource);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Resource(resId=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType$Url;", "Lapp/chalo/compose/components/HorizontalImageViewerDialogImageType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Url extends HorizontalImageViewerDialogImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1845a;

        public Url(String url) {
            Intrinsics.i(url, "url");
            this.f1845a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Url) && Intrinsics.d(this.f1845a, ((Url) obj).f1845a);
        }

        public final int hashCode() {
            return this.f1845a.hashCode();
        }

        public final String toString() {
            return vo1.B("Url(url=", this.f1845a, ")");
        }
    }
}
