package app.chalo.mvibase.simple;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/mvibase/simple/ViewStateCollectionResult;", "T", "", "ScreenNotActive", "Data", "Lapp/chalo/mvibase/simple/ViewStateCollectionResult$Data;", "Lapp/chalo/mvibase/simple/ViewStateCollectionResult$ScreenNotActive;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ViewStateCollectionResult<T> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mvibase/simple/ViewStateCollectionResult$Data;", "T", "Lapp/chalo/mvibase/simple/ViewStateCollectionResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data<T> extends ViewStateCollectionResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6001a;
        public final int b;

        public Data(Object obj, int i) {
            this.f6001a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.d(this.f6001a, data.f6001a) && this.b == data.b;
        }

        public final int hashCode() {
            Object obj = this.f6001a;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return "Data(data=" + this.f6001a + ", counter=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/mvibase/simple/ViewStateCollectionResult$ScreenNotActive;", "Lapp/chalo/mvibase/simple/ViewStateCollectionResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScreenNotActive extends ViewStateCollectionResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScreenNotActive f6002a = new ScreenNotActive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScreenNotActive);
        }

        public final int hashCode() {
            return -2008093789;
        }

        public final String toString() {
            return "ScreenNotActive";
        }
    }
}
