package conf.switches

import common.Edition
import conf.switches.SwitchGroup.ABTests
import org.joda.time.LocalDate

trait ABTestSwitches {

  val ABDiscussionExternalFrontend = Switch(
    SwitchGroup.ABTests,
    "ab-discussion-external-frontend",
    "Standalone frontend discussion",
    owners = Seq(Owner.withGithub("piuccio")),
    safeState = On,
    sellByDate = new LocalDate(2016, 11, 3),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-discussion-promote-comments",
    "Promote the comments with a sticky bottom banner",
    owners = Seq(Owner.withGithub("nicl")),
    safeState = On,
    sellByDate = new LocalDate(2016, 11, 9),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-weekend-reading-email",
    "Try out two formats for the Weekend Reading email",
    owners = Seq(Owner.withGithub("katebee")),
    safeState = Off,
    sellByDate = new LocalDate(2016, 10, 31),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-weekend-reading-promo",
    "Show visitors a snap banner to promote the Weekend Reading email",
    owners = Seq(Owner.withGithub("katebee")),
    safeState = Off,
    sellByDate = new LocalDate(2016, 10, 31),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-membership-engagement-warp-factor-one",
    "The first level of prominent membership engagement messaging",
    owners = Seq(Owner.withGithub("justinpinner")),
    safeState = Off,
    sellByDate = new LocalDate(2016, 11, 3),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-hosted-onward-journey",
    "Show more pages from the campaign in Hosted Article/Video pages, using a carousel or popup",
    owners = Seq(Owner.withGithub("lps88")),
    safeState = Off,
    sellByDate = new LocalDate(2017, 1, 18),
    exposeClientSide = true
  )

  Switch(
    ABTests,
    "ab-membership-engagement-message-copy-experiment",
    "Test alternate short messages on membership engagement banner",
    owners = Seq(Owner.withGithub("justinpinner")),
    safeState = Off,
    sellByDate = new LocalDate(2016, 11, 8),
    exposeClientSide = true
  )
}
