package app.chalo.utils;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/utils/ForceAppUpdateError;", "", "NSURLObjectIsNull", "AndroidStringIsNull", "Lapp/chalo/utils/ForceAppUpdateError$AndroidStringIsNull;", "Lapp/chalo/utils/ForceAppUpdateError$NSURLObjectIsNull;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ForceAppUpdateError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/ForceAppUpdateError$AndroidStringIsNull;", "Lapp/chalo/utils/ForceAppUpdateError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AndroidStringIsNull extends ForceAppUpdateError {
        @Override // app.chalo.utils.ForceAppUpdateError
        public final String a() {
            return "Android package name is null";
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AndroidStringIsNull);
        }

        public final int hashCode() {
            return 1793991923;
        }

        public final String toString() {
            return "AndroidStringIsNull(message=Android package name is null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/ForceAppUpdateError$NSURLObjectIsNull;", "Lapp/chalo/utils/ForceAppUpdateError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NSURLObjectIsNull extends ForceAppUpdateError {
        @Override // app.chalo.utils.ForceAppUpdateError
        public final String a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NSURLObjectIsNull);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NSURLObjectIsNull(message=null)";
        }
    }

    public abstract String a();
}
