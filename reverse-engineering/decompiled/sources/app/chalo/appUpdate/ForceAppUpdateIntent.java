package app.chalo.appUpdate;

import app.chalo.scenes.args.UpdateType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "", "InitializationIntent", "OnUpdateBtnClicked", "OnRemindLaterClicked", "OnBackPressed", "Lapp/chalo/appUpdate/ForceAppUpdateIntent$InitializationIntent;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnBackPressed;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnRemindLaterClicked;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnUpdateBtnClicked;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ForceAppUpdateIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateIntent$InitializationIntent;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ForceAppUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpdateType f948a;

        public InitializationIntent(UpdateType updateType) {
            Intrinsics.i(updateType, "updateType");
            this.f948a = updateType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f948a == ((InitializationIntent) obj).f948a;
        }

        public final int hashCode() {
            return this.f948a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(updateType=" + this.f948a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnBackPressed;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressed extends ForceAppUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f949a = new OnBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnRemindLaterClicked;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRemindLaterClicked extends ForceAppUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRemindLaterClicked f950a = new OnRemindLaterClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateIntent$OnUpdateBtnClicked;", "Lapp/chalo/appUpdate/ForceAppUpdateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUpdateBtnClicked extends ForceAppUpdateIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnUpdateBtnClicked f951a = new OnUpdateBtnClicked();
    }
}
