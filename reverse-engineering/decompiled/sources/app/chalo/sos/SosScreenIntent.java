package app.chalo.sos;

import app.chalo.sos.feature.SosContact;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/sos/SosScreenIntent;", "", "InitialisationIntent", "AddContactsClickedIntent", "EditMsgClickedIntent", "SendAlertClickedIntent", "RemoveContactIntent", "ConfirmSendAlertIntent", "SosMessageEnteredIntent", "SaveSosMessageIntent", "DismissDialogIntent", "BackClickedIntent", "SendSOSMessageIntent", "Lapp/chalo/sos/SosScreenIntent$AddContactsClickedIntent;", "Lapp/chalo/sos/SosScreenIntent$BackClickedIntent;", "Lapp/chalo/sos/SosScreenIntent$ConfirmSendAlertIntent;", "Lapp/chalo/sos/SosScreenIntent$DismissDialogIntent;", "Lapp/chalo/sos/SosScreenIntent$EditMsgClickedIntent;", "Lapp/chalo/sos/SosScreenIntent$InitialisationIntent;", "Lapp/chalo/sos/SosScreenIntent$RemoveContactIntent;", "Lapp/chalo/sos/SosScreenIntent$SaveSosMessageIntent;", "Lapp/chalo/sos/SosScreenIntent$SendAlertClickedIntent;", "Lapp/chalo/sos/SosScreenIntent$SendSOSMessageIntent;", "Lapp/chalo/sos/SosScreenIntent$SosMessageEnteredIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SosScreenIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$AddContactsClickedIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddContactsClickedIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddContactsClickedIntent f9407a = new AddContactsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddContactsClickedIntent);
        }

        public final int hashCode() {
            return 393397681;
        }

        public final String toString() {
            return "AddContactsClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$BackClickedIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClickedIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f9408a = new BackClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClickedIntent);
        }

        public final int hashCode() {
            return 1611989626;
        }

        public final String toString() {
            return "BackClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$ConfirmSendAlertIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmSendAlertIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmSendAlertIntent f9409a = new ConfirmSendAlertIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmSendAlertIntent);
        }

        public final int hashCode() {
            return -670518318;
        }

        public final String toString() {
            return "ConfirmSendAlertIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$DismissDialogIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissDialogIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialogIntent f9410a = new DismissDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialogIntent);
        }

        public final int hashCode() {
            return 2050463916;
        }

        public final String toString() {
            return "DismissDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$EditMsgClickedIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditMsgClickedIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditMsgClickedIntent f9411a = new EditMsgClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditMsgClickedIntent);
        }

        public final int hashCode() {
            return 1640460942;
        }

        public final String toString() {
            return "EditMsgClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$InitialisationIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f9412a;

        public InitialisationIntent(Map map) {
            this.f9412a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialisationIntent) && Intrinsics.d(this.f9412a, ((InitialisationIntent) obj).f9412a);
        }

        public final int hashCode() {
            Map map = this.f9412a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public final String toString() {
            return "InitialisationIntent(sosRequestParams=" + this.f9412a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$RemoveContactIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveContactIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SosContact f9413a;

        public RemoveContactIntent(SosContact contact) {
            Intrinsics.i(contact, "contact");
            this.f9413a = contact;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveContactIntent) && Intrinsics.d(this.f9413a, ((RemoveContactIntent) obj).f9413a);
        }

        public final int hashCode() {
            return this.f9413a.hashCode();
        }

        public final String toString() {
            return "RemoveContactIntent(contact=" + this.f9413a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$SaveSosMessageIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveSosMessageIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SaveSosMessageIntent f9414a = new SaveSosMessageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveSosMessageIntent);
        }

        public final int hashCode() {
            return -935426677;
        }

        public final String toString() {
            return "SaveSosMessageIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$SendAlertClickedIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendAlertClickedIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SendAlertClickedIntent f9415a = new SendAlertClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendAlertClickedIntent);
        }

        public final int hashCode() {
            return 1556799377;
        }

        public final String toString() {
            return "SendAlertClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$SendSOSMessageIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendSOSMessageIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SendSOSMessageIntent f9416a = new SendSOSMessageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendSOSMessageIntent);
        }

        public final int hashCode() {
            return 310944150;
        }

        public final String toString() {
            return "SendSOSMessageIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenIntent$SosMessageEnteredIntent;", "Lapp/chalo/sos/SosScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SosMessageEnteredIntent extends SosScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9417a;

        public SosMessageEnteredIntent(String msg) {
            Intrinsics.i(msg, "msg");
            this.f9417a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SosMessageEnteredIntent) && Intrinsics.d(this.f9417a, ((SosMessageEnteredIntent) obj).f9417a);
        }

        public final int hashCode() {
            return this.f9417a.hashCode();
        }

        public final String toString() {
            return vo1.B("SosMessageEnteredIntent(msg=", this.f9417a, ")");
        }
    }
}
