package app.chalo.core.networkinspector;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorSideEffect;", "", "CopyCurl", "Lapp/chalo/core/networkinspector/NetworkInspectorSideEffect$CopyCurl;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NetworkInspectorSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorSideEffect$CopyCurl;", "Lapp/chalo/core/networkinspector/NetworkInspectorSideEffect;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyCurl implements NetworkInspectorSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2304a;

        public CopyCurl(String str) {
            this.f2304a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopyCurl) && Intrinsics.d(this.f2304a, ((CopyCurl) obj).f2304a);
        }

        public final int hashCode() {
            return this.f2304a.hashCode();
        }

        public final String toString() {
            return vo1.B("CopyCurl(curl=", this.f2304a, ")");
        }
    }
}
